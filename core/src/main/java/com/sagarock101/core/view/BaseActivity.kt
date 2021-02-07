package com.sagarock101.core.view

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatDelegate
import com.sagarock101.core.R
import dagger.android.support.DaggerAppCompatActivity
import timber.log.Timber

abstract class BaseActivity : DaggerAppCompatActivity() {

    internal lateinit var contentLayout: View
    internal lateinit var progressBar: ProgressBar

    abstract val layout: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!shouldUseDataBinding()) {
            setContentView(R.layout.activity_base)
            progressBar = findViewById(R.id.base_progress_bar)
        }
//        requestedOrientation = if (resources.getBoolean(R.bool.is_portrait_only)) {
//            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
//        } else {
//            ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
//        }
        getDataFromBundle()
        observeNetworkState()
    }

    abstract fun navigate(screenName:String, bundle: Bundle)
    //override this method to extract data from bundle
    abstract fun toggleHeader(showHeader: Boolean)

    abstract fun hideSearchIcon(iconVisible:Boolean)

    abstract fun searchIcon(showIcon : Boolean)
    protected fun getDataFromBundle() {}

    protected fun observeNetworkState() {}

    protected fun setLoading(isLoading: Boolean) {
        if (isLoading) {
            showProgress()
        } else {
            hideProgressBar()
        }
    }

    fun showProgress() {
        try {
            progressBar.visibility = View.VISIBLE
        } catch (e: Exception) {
            Timber.e(e)
        }
    }

    fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }

    /**
     * @return true if child activity should use data binding instead of [.setContentView]
     */
    protected open fun shouldUseDataBinding(): Boolean {
        return false
    }

    companion object {
        //Explicit Enabling of Vector Drawable Support for API-20 and bellow.
        init {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        }
    }





}

