package com.sagarock101.search.ui.activity

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.MyAnimationUtils.startRevealOnGlobalLayoutChangeForActivity
import com.sagarock101.core.utils.MyAnimationUtils.unRevealActivity
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.search.R
import com.sagarock101.search.databinding.ActivitySearchBinding
import com.sagarock101.stylekit.binding.getColorFromAttr
import dagger.android.support.DaggerAppCompatActivity
import java.util.jar.Manifest
import kotlin.properties.Delegates

const val REQUEST_PERMISSION_CODE = 101

class SearchActivity : DaggerAppCompatActivity() {
    //TODO: need to refactor hardcoded intent key names
    lateinit var rootLayout: ConstraintLayout
    lateinit var binding: ActivitySearchBinding

    var revealX by Delegates.notNull<Int>()
    var revealY by Delegates.notNull<Int>()

    private val LIGHT_THEME = com.sagarock101.stylekit.R.style.LightTheme
    private val DARK_THEME = com.sagarock101.stylekit.R.style.DarkTheme

    private var themeSelected: Int? = null

    lateinit var preferenceHelper: PreferenceHelper

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkIsPermissionForSpeechRecordingIsGranted()
        revealX = intent.getIntExtra("revealX", 0)
        revealY = intent.getIntExtra("revealY", 0)
        setupSharedPreferences()
        setupTheme()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search)
        rootLayout = binding.clSearchRoot
        rootLayout.startRevealOnGlobalLayoutChangeForActivity(
            revealX,
            revealY,
            ResourcesCompat.getColor(resources, getColorFromAttr(R.attr.btmIconAndTextColor), null),
            ResourcesCompat.getColor(resources, getColorFromAttr(R.attr.bgColor), null)
        )
    }

    private fun checkIsPermissionForSpeechRecordingIsGranted() {
        if (ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.RECORD_AUDIO
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.RECORD_AUDIO),
                REQUEST_PERMISSION_CODE
            )
        }
    }

    @SuppressLint("ResourceType")
    override fun onBackPressed() {
        rootLayout.unRevealActivity(
            revealX,
            revealY,
            ResourcesCompat.getColor(resources, getColorFromAttr(R.attr.btmIconAndTextColor), null),
            ResourcesCompat.getColor(resources, getColorFromAttr(R.attr.bgColor), null)
        ) {
            finish()
        }
        super.onBackPressed()
    }

    private fun setupSharedPreferences() {
        preferenceHelper = PreferenceHelper(this)
        themeSelected =
            preferenceHelper.getStringToPreferences(AppConstants.UI_THEME_KEY, LIGHT_THEME)
    }

    private fun setupTheme() {
        themeSelected?.let { setTheme(it) }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

}