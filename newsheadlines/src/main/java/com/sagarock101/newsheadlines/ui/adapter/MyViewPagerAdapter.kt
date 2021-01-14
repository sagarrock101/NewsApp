package com.sagarock101.newsheadlines.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.sagarock101.core.utilities.SmartFragmentStatePagerAdapter
import com.sagarock101.newsheadlines.model.Articles
import com.sagarock101.newsheadlines.ui.fragments.NewsDetailFragment
import com.sagarock101.newsheadlines.ui.fragments.NewsDetailWebFragment

class MyViewPagerAdapter(fragmentManager: FragmentManager, val article: Articles) :
    SmartFragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> NewsDetailFragment()
            1 ->  NewsDetailWebFragment()
            else -> NewsDetailFragment()
        }
    }

    override fun getCount() = 2
}