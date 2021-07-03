package com.sagarock101.newsapp.ui.activities

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.stylekit.R
import com.sagarock101.stylekit.binding.changeStatusBarBasedOnTheme
import com.sagarock101.stylekit.databinding.ActivityAboutBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

val LIGHT_THEME = R.style.LightTheme
val DARK_THEME = R.style.DarkTheme
class AboutActivity : DaggerAppCompatActivity(), View.OnClickListener {

    private var themeSelected: Int? = null

    lateinit var activityAboutBinding: ActivityAboutBinding

    @Inject
    lateinit var preferenceHelper: PreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupSharedPreferences()
        setupTheme()
        changeStatusBarBasedOnTheme()
        activityAboutBinding = DataBindingUtil.setContentView(this, R.layout.activity_about)
        activityAboutBinding.customAppBar.toolbarTitle.text = getString(com.sagarock101.newsapp.R.string.about_title)
    }

    private fun setupTheme() {
        themeSelected?.let { setTheme(it) }
    }

    private fun setupSharedPreferences() {
        themeSelected = preferenceHelper.getStringToPreferences(AppConstants.UI_THEME_KEY, LIGHT_THEME)
    }

    override fun onClick(view: View?) {
        when(view) {
            activityAboutBinding.btnOk, activityAboutBinding.customAppBar.ivBack -> onBackPressed()
        }
    }

    override fun onResume() {
        super.onResume()
        activityAboutBinding.btnOk.setOnClickListener(this)
        activityAboutBinding.customAppBar.ivBack.setOnClickListener(this)
    }

    override fun onPause() {
        activityAboutBinding.btnOk.setOnClickListener(null)
        activityAboutBinding.customAppBar.ivBack.setOnClickListener(null)
        super.onPause()
    }
}