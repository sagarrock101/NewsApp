package com.sagarock101.widget

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.widget.ImageViewCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.snackbar.Snackbar
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.core.utils.Utils
import com.sagarock101.core.utils.Utils.setOnSingleClickListener
import com.sagarock101.database.model.Articles
import com.sagarock101.stylekit.binding.setTransparentStatusBar
import com.sagarock101.widget.databinding.ActivityWidgetItemDetailBinding
import dagger.android.support.DaggerAppCompatActivity
import java.lang.Exception
import java.sql.Timestamp
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.ZonedDateTime
import java.util.*
import javax.inject.Inject


class WidgetItemDetailActivity : DaggerAppCompatActivity(), View.OnClickListener,
    AppBarLayout.OnOffsetChangedListener {

    private var isSaved: Boolean = false
    lateinit var binding: ActivityWidgetItemDetailBinding

    private var articles: Articles? = null

    private var themeSelected: Int? = null

    lateinit var preferenceHelper: PreferenceHelper

    private val LIGHT_THEME = com.sagarock101.stylekit.R.style.LightTheme
    private val DARK_THEME = com.sagarock101.stylekit.R.style.DarkTheme

    private var isFabRotated = false

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: WidgetViewModel

    private var snackBarDismissListener: Snackbar.Callback? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTransparentStatusBar()
        viewModel = ViewModelProvider(this, viewModelFactory).get(WidgetViewModel::class.java)
        setupSharedPreferences()
        setupTheme()
        if (intent != null) {
            articles = intent.getParcelableExtra(ARTICLE_ITEM)
        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_widget_item_detail)
        binding.article = articles
        binding.ivBack.setOnClickListener(this)
        binding.appBar.addOnOffsetChangedListener(this)
        binding.fabSave.hideChildFabInitially()
        binding.fabShare.hideChildFabInitially()
        setClickListener()
        articles?.let { viewModel.checkIfSaved(it) }
        setSaveObserver()
        snackBarDismissListener = object : Snackbar.Callback() {

            override fun onDismissed(sb: Snackbar?, event: Int) {
                binding.llFab.animate().translationY(0f)
            }

            override fun onShown(sb: Snackbar?) {
                sb?.view?.height?.toFloat()?.let { binding.llFab.translationY = -it }
            }
        }
    }

    private fun setSaveObserver() {
        viewModel.savedLiveData.observe(this, Observer { isSaved ->
            this.isSaved = isSaved
            if (this.isSaved) {
                ImageViewCompat.setImageTintList(
                    binding.fabSave,
                    ColorStateList.valueOf(Color.BLACK)
                )
            } else {
                ImageViewCompat.setImageTintList(
                    binding.fabSave,
                    ColorStateList.valueOf(Color.WHITE)
                )
            }
        })
    }


    private fun setupSharedPreferences() {
        preferenceHelper = PreferenceHelper(this)
        themeSelected =
            preferenceHelper.getStringToPreferences(AppConstants.UI_THEME_KEY, LIGHT_THEME)
    }

    private fun setupTheme() {
        themeSelected?.let { setTheme(it) }
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.ivBack -> {
                finish()
            }

            binding.btnReadFullStory -> showAppChooserDialog()

            binding.fabAdd -> animateFab(v)

            binding.fabShare -> shareArticle()

            binding.fabSave -> if (isSaved) deleteArticle() else saveArticle()
        }
    }

    private fun saveArticle() {
        articles?.let {
            try {
                it.publishedAt = Utils.getCurrentTimeStamp()
            } catch (e: Exception) {
                Utils.showToast(this, "${e.message}")
            }
            viewModel.insertNews(it)
            showSnack("Saved")
        }
        refreshWidget()
    }

    private fun deleteArticle() {
        articles?.let {
            viewModel.deleteNews(it)
            showSnack("Removed")
        }
        refreshWidget()
    }

    private fun refreshWidget() {
        Utils.refreshWidget(this, MyAppWidgetProvider::class.java.name, R.id.stack_view)
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        if (verticalOffset == -binding.appBar.totalScrollRange) {
            binding.fabAdd.visibility = View.VISIBLE
            binding.fabShare.visibility = View.VISIBLE
            binding.fabSave.visibility = View.VISIBLE
            binding.ivGradient.visibility = View.VISIBLE
        } else {
            binding.fabAdd.visibility = View.GONE
            binding.fabShare.visibility = View.GONE
            binding.fabSave.visibility = View.GONE
            binding.ivGradient.visibility = View.GONE
        }
    }

    private fun setClickListener() {
        binding.btnReadFullStory.setOnClickListener(this)
        binding.fabAdd.setOnClickListener(this)
        binding.fabSave.setOnSingleClickListener(this, 2000)
        binding.fabShare.setOnClickListener(this)
    }

    private fun showAppChooserDialog() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(articles?.url))
        startActivity(intent)
    }

    private fun animateFab(v: View) {
        isFabRotated = v.rotateFab(!isFabRotated)
        if (isFabRotated) {
            binding.fabShare.showFab()
            binding.fabSave.showFab()
            binding.fabAdd.visibility = View.VISIBLE
        } else {
            binding.fabShare.hideFab()
            binding.fabSave.hideFab()
            binding.fabAdd.visibility = View.VISIBLE
        }
    }

    private fun shareArticle() {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, articles?.title)
            putExtra(Intent.EXTRA_TEXT, articles?.url)
            startActivity(Intent.createChooser(sharingIntent, getString(R.string.share_using)))
        }
    }

    private fun showSnack(actionName: String) {
        Snackbar.make(binding.fabAdd, actionName, Snackbar.LENGTH_SHORT)
            .addCallback(snackBarDismissListener)
            .show()
    }

}