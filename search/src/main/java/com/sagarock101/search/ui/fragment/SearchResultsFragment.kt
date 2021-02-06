package com.sagarock101.search.ui.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.lifecycle.Observer
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.search.R
import com.sagarock101.search.databinding.FragmentSearchBinding
import com.sagarock101.search.model.Articles
import com.sagarock101.search.ui.activity.SearchActivity
import com.sagarock101.search.ui.adapters.SearchResultsAdapter
import com.sagarock101.search.ui.viewmodel.SearchViewModel
import javax.inject.Inject

class SearchResultsFragment : BaseViewModelFragment<FragmentSearchBinding, SearchViewModel>(),
    View.OnClickListener, TextWatcher {

    lateinit var searchListAdapter: SearchResultsAdapter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun getLayout() = R.layout.fragment_search

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchListAdapter = SearchResultsAdapter()
    }

    override fun onResume() {
        super.onResume()
        binding.etSearch.addTextChangedListener(this)
    }

    override fun initView(view: View) {
        binding.ivClose.setOnClickListener(this)
        viewModel = injectViewModel(viewModelFactory)
        viewModel.getSearchResults("donald duck")
        binding.rvSearchResults.adapter = searchListAdapter
        viewModel.searchResultsLiveData.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                DataWrapper.Status.LOADING -> {
                }
                DataWrapper.Status.SUCCESS -> {
                    searchListAdapter.setItems(it.data?.articles as MutableList<Articles>)
                }
                DataWrapper.Status.ERROR -> {
                }
            }
        })
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.ivClose -> {
                hideKeyboard()
                activity?.onBackPressed()
            }
        }
    }

    override fun afterTextChanged(s: Editable?) {
        if(s.toString().trim().isNotEmpty())
            viewModel.getSearchResults(s.toString())
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    override fun onPause() {
        super.onPause()
        binding.etSearch.removeTextChangedListener(this)
    }


}