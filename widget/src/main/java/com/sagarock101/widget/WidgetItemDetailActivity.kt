package com.sagarock101.widget

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.appbar.AppBarLayout
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.database.model.Articles
import com.sagarock101.widget.databinding.ActivityWidgetItemDetailBinding

class WidgetItemDetailActivity : AppCompatActivity(), View.OnClickListener, AppBarLayout.OnOffsetChangedListener {

    lateinit var binding: ActivityWidgetItemDetailBinding

    private var articles: Articles? = null

    private var themeSelected: Int? = null

    lateinit var preferenceHelper: PreferenceHelper

    private val LIGHT_THEME = com.sagarock101.stylekit.R.style.LightTheme
    private val DARK_THEME = com.sagarock101.stylekit.R.style.DarkTheme

    private var isFabRotated = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

//            binding.fabSave -> if (isSaved) deleteArticle() else saveArticle()
        }
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