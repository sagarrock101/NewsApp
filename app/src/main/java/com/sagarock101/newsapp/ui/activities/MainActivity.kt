package com.sagarock101.newsapp.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.gson.Gson
import com.sagarock101.newsapp.R
import com.sagarock101.newsheadlines.data.remote.NewsHeadlinesService
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    private var navController: NavController? = null
    private var appBarConfiguration: AppBarConfiguration? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        navController = findNavController(R.id.nav_main_root)
//        appBarConfiguration = AppBarConfiguration(navController!!.graph)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setUpActionBar()
    }

    private fun setUpActionBar() {
//        setupActionBarWithNavController(navController!!, appBarConfiguration!!)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        return navController!!.navigateUp() || super.onSupportNavigateUp()
//    }

}