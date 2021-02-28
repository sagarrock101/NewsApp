package com.sagarock101.categories.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.sagarock101.categories.R
import com.sagarock101.categories.databinding.FragmentSourcesBinding
import com.sagarock101.categories.model.Source
import com.sagarock101.categories.ui.adapter.SourcesAdapter
import com.sagarock101.categories.viewmodel.SourceViewModel
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.view.BaseViewModelFragment
import javax.inject.Inject

class SourcesFragment : BaseViewModelFragment<FragmentSourcesBinding, SourceViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var adapter: SourcesAdapter

    private var btmNavHeight = 0

    override fun getLayout() = R.layout.fragment_sources

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = SourcesAdapter()
    }

    override fun isNetworkActive(isActive: Boolean) {

    }

    override fun initView(view: View) {
        viewModel = injectViewModel(viewModelFactory)
        viewModel.getSources().observe(viewLifecycleOwner, Observer {
            when(it.status) {
                DataWrapper.Status.LOADING -> {
                    it.message?.let { it1 -> showToast(it1) }
                }
                DataWrapper.Status.SUCCESS -> {
                    it?.data?.let {
                        adapter.setItems(it.sources as MutableList<Source>)
                    }
                    binding.rvSources.adapter = adapter
                }
                DataWrapper.Status.ERROR -> {
//                    it.message?.let { it1 -> showToast(it1) }
                }
            }
        })
    }

}