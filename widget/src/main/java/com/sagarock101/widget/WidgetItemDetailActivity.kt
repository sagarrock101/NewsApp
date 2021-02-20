package com.sagarock101.widget

import android.R.attr.data
import android.appwidget.AppWidgetManager
import android.content.ComponentName
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
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.core.utils.Utils
import com.sagarock101.database.model.Articles
import com.sagarock101.widget.databinding.ActivityWidgetItemDetailBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


class WidgetItemDetailActivity : DaggerAppCompatActivity(), View.OnClickListener, AppBarLayout.OnOffsetChangedListener {

    companion object {

    }

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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory).get(WidgetViewModel::class.java)
        setupSharedPreferences()
        setupTheme()
        if(intent != null) {
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
        when(v) {
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
            viewModel.insertNews(it)
//            showSnack("Saved")
        }
        refreshWidget()
    }

    private fun deleteArticle() {
        articles?.let {
            viewModel.deleteNews(it)
//            showSnack("Removed")
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
        } else {
            binding.fabAdd.visibility = View.GONE
            binding.fabShare.visibility = View.GONE
            binding.fabSave.visibility = View.GONE
        }
    }

    private fun setClickListener() {
        binding.btnReadFullStory.setOnClickListener(this)
        binding.fabAdd.setOnClickListener(this)
        binding.fabSave.setOnClickListener(this)
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

}