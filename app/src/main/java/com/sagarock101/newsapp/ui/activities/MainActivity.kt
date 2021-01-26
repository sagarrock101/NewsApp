package com.sagarock101.newsapp.ui.activities

import android.animation.Animator
import android.animation.ObjectAnimator
import android.app.AlertDialog
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sagarock101.FragmentDialogTheme
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity

const val BTM_NAV_ANIM_DURATION = 300L
class MainActivity : DaggerAppCompatActivity(), NavController.OnDestinationChangedListener,
    BottomNavigationView.OnNavigationItemReselectedListener, FragmentDialogTheme.Companion.OnDialogThemeBtnListener {

    private var dialogFragment: FragmentDialogTheme? = null
    private var dialog: AlertDialog.Builder? = null
    lateinit var binding: ActivityMainBinding

    private val navController by lazy { findNavController(R.id.nav_main_fragment) }

    private var btmNavObjectAnimator: ObjectAnimator? = null
    private var btmNavAlphaObjectAnimator: ObjectAnimator? = null

    private var themeName: Int = com.sagarock101.stylekit.R.style.DarkTheme

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(themeName)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btmNav.setOnNavigationItemReselectedListener(this)
//        binding.btmNav.setOnNavigationItemSelectedListener(this)
        setSupportActionBar(binding.customAppBar.toolbar)
        supportActionBar?.title = getString(R.string.empty)
        binding.btmNav.setupWithNavController(findNavController(R.id.nav_main_fragment))
        createDialog()
    }

    private fun createDialog() {
        dialogFragment = FragmentDialogTheme().apply {
            listener = this@MainActivity
        }
//        val dialogThemeBinding = DialogThemeBinding.inflate(layoutInflater)
//        dialog = getDialog()
//        dialog?.setView(dialogThemeBinding.root)
////        showThemeFromSharedPref(themeRadioGroup)
//        dialogThemeBinding.rgThemes.setOnCheckedChangeListener { group, checkedId ->
//            when(checkedId) {
//                dialogThemeBinding.rbLightTheme.id -> {
//
//                }
//                dialogThemeBinding.rbDartkTheme.id -> {
//
//                }
//            }
//        }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when (destination.id) {
            R.id.newsDetailFragment -> {
                hideBtmNavBar()
                binding.customAppBar.clAppBar.visibility = View.GONE
            }

            R.id.newsHeadlinesFragment -> {
                showBtnNavBar()
                binding.customAppBar.clAppBar.visibility = View.VISIBLE
            }

            R.id.newsDetailFragment2 -> {
                hideBtmNavBar()
                binding.customAppBar.clAppBar.visibility = View.GONE
            }

            R.id.savedFragment -> {
                showBtnNavBar()
                binding.customAppBar.clAppBar.visibility = View.VISIBLE
            }
        }
    }

    private fun showBtnNavBar() {
        if (binding.btmNav.visibility == View.VISIBLE)
            return

        val listener = object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                btmNavObjectAnimator?.removeAllListeners()
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationStart(animation: Animator?) {
                binding.btmNav.visibility = View.VISIBLE
                binding.btmNav.setBackgroundResource(R.color.white)
            }

        }
        btmNavAlphaObjectAnimator = ObjectAnimator.ofFloat(binding.btmNav, View.ALPHA, 0f, 1f)
        btmNavObjectAnimator = ObjectAnimator.ofFloat(
            binding.btmNav,
            View.TRANSLATION_Y,
            binding.btmNav.height.toFloat(),
            0f
        ).apply {
            addListener(listener)
            duration = BTM_NAV_ANIM_DURATION
            start()
        }
    }

    private fun hideBtmNavBar() {
        val listener = object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                binding.btmNav.visibility = View.GONE
                btmNavObjectAnimator?.removeAllListeners()
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationStart(animation: Animator?) {
                binding.btmNav.setBackgroundResource(android.R.color.transparent)
            }

        }
        btmNavAlphaObjectAnimator = ObjectAnimator.ofFloat(binding.btmNav, View.ALPHA, 1f, 0f)
        btmNavObjectAnimator = ObjectAnimator.ofFloat(
            binding.btmNav,
            View.TRANSLATION_Y,
            0f,
            binding.btmNav.height.toFloat()
        ).apply {
            addListener(listener)
            duration = BTM_NAV_ANIM_DURATION
            start()
        }
    }

    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(this)
    }


    override fun onPause() {
        super.onPause()
        navController.removeOnDestinationChangedListener(this)
    }

    override fun onNavigationItemReselected(item: MenuItem) {

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_change_theme, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.nav_change_theme -> {
                showDialog()
                return true
            }
        }
        return false
    }

    private fun getDialog(): AlertDialog.Builder {
        return AlertDialog.Builder(this, com.sagarock101.stylekit.R.style.LightThemeDialog)
    }

    private fun showDialog() {
        dialogFragment?.show(supportFragmentManager, "")
//        dialog?.show()
    }

    override fun onDialogThemeBtnClick(themeName: String) {
        changeTheme(themeName)
    }

    private fun changeTheme(themeName: String) {
        when(themeName) {
            getString(com.sagarock101.stylekit.R.string.light_theme) -> {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                this.themeName = com.sagarock101.stylekit.R.style.LightTheme
                recreate()
            }

            getString(com.sagarock101.stylekit.R.string.dark_theme) -> {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                this.themeName = com.sagarock101.stylekit.R.style.DarkTheme
                recreate()
            }
        }
    }

    override fun onBackPressed() {
        if(dialogFragment?.isAdded!!) {
            dialogFragment?.dismiss()
        }
        super.onBackPressed()
    }

}