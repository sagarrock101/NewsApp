package com.sagarock101.newsapp.ui.activities

import android.animation.Animator
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.contains
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sagarock101.FragmentDialogTheme
import com.sagarock101.common.AppConstants
import com.sagarock101.core.utils.MyAnimationUtils.enterFabReveal
import com.sagarock101.core.utils.MyAnimationUtils.exitFabReveal
import com.sagarock101.core.utils.PreferenceHelper
import com.sagarock101.core.view.BaseActivity
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.databinding.ActivityMainBinding
import com.sagarock101.search.ui.activity.SearchActivity
import com.sagarock101.stylekit.binding.changeStatusBarBasedOnTheme
import javax.inject.Inject

const val BTM_NAV_ANIM_DURATION = 300L

class MainActivity : BaseActivity(), NavController.OnDestinationChangedListener,
    BottomNavigationView.OnNavigationItemReselectedListener,
    FragmentDialogTheme.Companion.OnDialogThemeBtnListener, View.OnClickListener {
    private var isOnBackPressingStarted = false

    //TODO: need to add the network change UI for all frags
    private var themeSelected: Int? = null
    private var themeDialogFragment = FragmentDialogTheme()
    lateinit var binding: ActivityMainBinding
    private var isNetworkActive = true

    private val navController by lazy { findNavController(R.id.nav_main_fragment) }

    private var btmNavObjectAnimator: ObjectAnimator? = null
    private var btmNavAlphaObjectAnimator: ObjectAnimator? = null

    private var themeName: Int? = null

    private val LIGHT_THEME = com.sagarock101.stylekit.R.style.LightTheme
    private val DARK_THEME = com.sagarock101.stylekit.R.style.DarkTheme
    private val navHashSet = HashSet<Int>()

    @Inject
    lateinit var preferenceHelper: PreferenceHelper

    override val layout: Int
        get() = R.layout.activity_main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changeStatusBarBasedOnTheme()
        setupSharedPreferences()
        setupTheme()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btmNav.setOnNavigationItemReselectedListener(this)
        binding.fabSearch.setOnClickListener(this)
        setSupportActionBar(binding.customAppBar.toolbar)
        supportActionBar?.title = getString(R.string.empty)
//        binding.btmNav.setupWithNavController(navController)
        binding.btmNav.setOnNavigationItemReselectedListener {

        }
        binding.btmNav.setOnNavigationItemSelectedListener { item ->
            isOnBackPressingStarted = false
            when (item.itemId) {
                R.id.navigation_news_headlines -> {
                    findNavController(R.id.nav_main_fragment).navigate(R.id.navigation_news_headlines)
                }

                R.id.navigation_saved -> {
                    findNavController(R.id.nav_main_fragment).navigate(R.id.navigation_saved)
                }

                R.id.navigation_sources -> {
                    findNavController(R.id.nav_main_fragment).navigate(R.id.navigation_sources)
                }
            }

            false
        }
        createDialog()
    }

    private fun setupTheme() {
        themeSelected?.let { setTheme(it) }
    }

    private fun setupSharedPreferences() {
        themeSelected =
            preferenceHelper.getStringToPreferences(AppConstants.UI_THEME_KEY, LIGHT_THEME)
    }

    private fun createDialog() {
        themeDialogFragment?.setListener(this)
        themeSelected?.let { themeDialogFragment.setThemeToBeChecked(it) }
    }

    @SuppressLint("RestrictedApi")
    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        if (isOnBackPressingStarted) {
           if(navHashSet.contains(destination.id)) {
               updateMenuOnBackPress(destination.parent!!.id)
               navController.popBackStack(destination.id, true)
               if(navController.backStack.size == 0)
                   return
               return
           }
        }
        when (destination.id) {
            R.id.newsDetailFragment -> {
                hideBtmNavBar()
                hideViewOrShowViews(View.GONE)
                binding.fabSearch.exitFabReveal()
            }

            R.id.newsHeadlinesFragment -> {
                showBtnNavBar()
                hideViewOrShowViews(View.VISIBLE)
                if ((binding.root as ViewGroup).contains(binding.fabSearch) && isNetworkActive)
                    binding.fabSearch.enterFabReveal()
//                updateMenuOnBackPress(R.id.navigation_news_headlines)
                updateMenuOnBackPress(destination.parent!!.id)
            }

            R.id.newsDetailFragment2 -> {
                hideBtmNavBar()
                hideViewOrShowViews(View.GONE)
                binding.fabSearch.exitFabReveal()
            }

            R.id.savedFragment -> {
                showBtnNavBar()
                binding.customAppBar.clAppBar.visibility = View.VISIBLE
                binding.fabSearch.exitFabReveal()
//                updateMenuOnBackPress(R.id.navigation_saved)
                updateMenuOnBackPress(destination.parent!!.id)
            }
            R.id.sourcesFragment -> {
                binding.fabSearch.exitFabReveal()
//                updateMenuOnBackPress(R.id.navigation_sources)
                updateMenuOnBackPress(destination.parent!!.id)
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
        themeSelected?.let {
            preferenceHelper.saveToPreferences(AppConstants.UI_THEME_KEY, it)
        }
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

    override fun isNetworkActive(isActive: Boolean) {
        if (!isActive) {
            binding.fabSearch.visibility = View.GONE
            isNetworkActive = false
        } else {
            isNetworkActive = true
            binding.fabSearch.enterFabReveal()
        }
    }

    private fun hideNoInternetMessage() {}

    private fun showNoInternetMessage() {

    }

    private fun showDialog() {
        themeDialogFragment?.show(supportFragmentManager, "")
    }

    override fun onDialogThemeBtnClick(themeName: String) {
        changeTheme(themeName)
    }

    private fun changeTheme(themeName: String) {
        when (themeName) {
            getString(com.sagarock101.stylekit.R.string.light_theme) -> {
                this.themeName = com.sagarock101.stylekit.R.style.LightTheme
                themeSelected = LIGHT_THEME
                themeDialogFragment?.dismiss()
                recreate()
            }

            getString(com.sagarock101.stylekit.R.string.dark_theme) -> {
                this.themeName = com.sagarock101.stylekit.R.style.DarkTheme
                themeSelected = DARK_THEME
                themeDialogFragment?.dismiss()
                recreate()
            }
        }
    }

    override fun onBackPressed() {
        if (themeDialogFragment?.isAdded!!) {
            themeDialogFragment?.dismiss()
        }
        isOnBackPressingStarted = true
        if (!navHashSet.contains(navController.currentDestination?.id)) {
            navHashSet.add(navController.currentDestination!!.id)
        }
        super.onBackPressed()
    }

    private fun updateMenuOnBackPress(destinationId: Int) {
        val menu = binding.btmNav.menu
        for (menuItemIndex in 0 until menu.size()) {
            val item = menu.getItem(menuItemIndex)
            if (destinationId == item.itemId)
                item.isChecked = true
        }
    }

    private fun hideViewOrShowViews(visibility: Int) {
        binding.customAppBar.clAppBar.visibility = visibility
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.fabSearch -> {
                showSearchDialog(v)
            }
        }
    }

    private fun showSearchDialog(view: View) {
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, view, "transition")
        val revealX = (view.x + (view.width / 2)).toInt()
        val revealY = (view.y + (view.height / 2)).toInt()
        val intent = Intent(this, SearchActivity::class.java)
            .apply {
                putExtra("revealX", revealX)
                putExtra("revealY", revealY)
            }
        ActivityCompat.startActivity(this, intent, options.toBundle())
    }

    override fun shouldUseDataBinding() = true

}