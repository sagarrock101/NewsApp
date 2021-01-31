package com.sagarock101.newsapp.ui.activities

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.transition.Transition
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.contains
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sagarock101.FragmentDialogTheme
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.Utils.enterReveal
import com.sagarock101.core.utils.Utils.exitReveal
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.ActivityMainBinding
import com.sagarock101.stylekit.binding.changeStatusBarBasedOnTheme
import dagger.android.support.DaggerAppCompatActivity

const val BTM_NAV_ANIM_DURATION = 300L

class MainActivity : DaggerAppCompatActivity(), NavController.OnDestinationChangedListener,
    BottomNavigationView.OnNavigationItemReselectedListener,
    FragmentDialogTheme.Companion.OnDialogThemeBtnListener {

    private var themeSelected: Int? = null
    private var dialogFragment = FragmentDialogTheme()

    lateinit var binding: ActivityMainBinding

    private val navController by lazy { findNavController(R.id.nav_main_fragment) }

    private var btmNavObjectAnimator: ObjectAnimator? = null
    private var btmNavAlphaObjectAnimator: ObjectAnimator? = null

    private var themeName: Int? = null

    private val LIGHT_THEME = com.sagarock101.stylekit.R.style.LightTheme
    private val DARK_THEME = com.sagarock101.stylekit.R.style.DarkTheme


    lateinit var sharedPreferences: SharedPreferences

    lateinit var sharedPrefFile: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changeStatusBarBasedOnTheme()
        setupSharedPreferences()
        setupTheme()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btmNav.setOnNavigationItemReselectedListener(this)
        setSupportActionBar(binding.customAppBar.toolbar)
        supportActionBar?.title = getString(R.string.empty)
        binding.btmNav.setupWithNavController(findNavController(R.id.nav_main_fragment))
        createDialog()
    }

    private fun setupTheme() {
        themeSelected?.let { setTheme(it) }
    }

    private fun setupSharedPreferences() {
        sharedPrefFile = applicationContext.packageName
        sharedPreferences = getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        themeSelected = sharedPreferences.getInt(AppConstants.UI_THEME_KEY, LIGHT_THEME)
    }

    private fun createDialog() {
        dialogFragment?.setListener(this)
        themeSelected?.let { dialogFragment.setThemeToBeChecked(it) }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when (destination.id) {
            R.id.newsDetailFragment -> {
                hideBtmNavBar()
                hideViewOrShowViews(View.GONE)
                binding.fabSearch.exitReveal()
            }

            R.id.newsHeadlinesFragment -> {
                showBtnNavBar()
                hideViewOrShowViews(View.VISIBLE)
                if ((binding.root as ViewGroup).contains(binding.fabSearch))
                    binding.fabSearch.enterReveal()
            }

            R.id.newsDetailFragment2 -> {
                hideBtmNavBar()
                hideViewOrShowViews(View.GONE)
                binding.fabSearch.exitReveal()
            }

            R.id.savedFragment -> {
                showBtnNavBar()
                binding.customAppBar.clAppBar.visibility = View.VISIBLE
                binding.fabSearch.exitReveal()
            }
            R.id.sourcesFragment -> {
                binding.fabSearch.exitReveal()
            }
            R.id.splashFragment -> {
                binding.fabSearch.visibility = View.INVISIBLE
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
                binding.btmNav.setBackgroundResource(if (themeSelected == LIGHT_THEME) R.color.white else R.color.black)
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
        val preferenceEditor = sharedPreferences.edit()
        themeSelected?.let { preferenceEditor.putInt(AppConstants.UI_THEME_KEY, it) }
        preferenceEditor.apply()
        navController.removeOnDestinationChangedListener(this)
        super.onPause()
    }

    override fun onNavigationItemReselected(item: MenuItem) {

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_change_theme, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_change_theme -> {
                showDialog()
                return true
            }
        }
        return false
    }

    private fun showDialog() {
        dialogFragment?.show(supportFragmentManager, "")
    }

    override fun onDialogThemeBtnClick(themeName: String) {
        changeTheme(themeName)
    }

    private fun changeTheme(themeName: String) {
        when (themeName) {
            getString(com.sagarock101.stylekit.R.string.light_theme) -> {
                this.themeName = com.sagarock101.stylekit.R.style.LightTheme
                themeSelected = LIGHT_THEME
                dialogFragment?.dismiss()
//                setTheme(LIGHT_THEME)
                recreate()
            }

            getString(com.sagarock101.stylekit.R.string.dark_theme) -> {
                this.themeName = com.sagarock101.stylekit.R.style.DarkTheme
                themeSelected = DARK_THEME
                dialogFragment?.dismiss()
//                setTheme(DARK_THEME)
                recreate()
            }
        }
    }

    override fun onBackPressed() {
        if (dialogFragment?.isAdded!!) {
            dialogFragment?.dismiss()
        }
        super.onBackPressed()
    }

    private fun hideViewOrShowViews(visibility: Int) {
        with(binding) {
            binding.customAppBar.clAppBar.visibility = visibility
        }
    }

}