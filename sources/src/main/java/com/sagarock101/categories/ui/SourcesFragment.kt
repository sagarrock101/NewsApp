package com.sagarock101.categories.ui

import android.view.View
import androidx.fragment.app.Fragment
import com.sagarock101.categories.R
import com.sagarock101.categories.databinding.FragmentSourcesBinding
import com.sagarock101.categories.viewmodel.SourceViewModel
import com.sagarock101.core.view.BaseViewModelFragment

class SourcesFragment : BaseViewModelFragment<FragmentSourcesBinding, SourceViewModel>() {

    override fun getLayout() = R.layout.fragment_sources

    override fun initView(view: View) {
    }
}