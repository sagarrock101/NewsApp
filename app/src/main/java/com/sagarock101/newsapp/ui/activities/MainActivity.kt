package com.sagarock101.newsapp.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.sagarock101.newsapp.R
import com.sagarock101.newsapp.interfaces.NavigationListener
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity(), NavigationListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    override fun navigate() {
    }

}