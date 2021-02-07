package com.sagarock101.search.ui.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.annotation.CheckResult
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.utils.Utils
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.search.R
import com.sagarock101.search.databinding.FragmentSearchBinding
import com.sagarock101.search.model.Articles
import com.sagarock101.search.model.Results
import com.sagarock101.search.ui.activity.SearchActivity
import com.sagarock101.search.ui.adapters.SearchResultsAdapter
import com.sagarock101.search.ui.viewmodel.SearchViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class SearchResultsFragment : BaseViewModelFragment<FragmentSearchBinding, SearchViewModel>(),
    View.OnClickListener
{

    lateinit var searchListAdapter: SearchResultsAdapter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun getLayout() = R.layout.fragment_search

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchListAdapter = SearchResultsAdapter()
    }

    @FlowPreview
    @ExperimentalCoroutinesApi
    override fun initView(view: View) {
        viewModel = injectViewModel(viewModelFactory)
        with(binding) {
            ivClose.setOnClickListener(this@SearchResultsFragment)
            vm = viewModel
            lifecycleOwner = this@SearchResultsFragment
            etSearch.textChanges()
                .debounce(1200)
                .distinctUntilChanged()
                .filterNot { it.isNullOrBlank() || it.length == 3 }
                .onEach {
                    it?.let {
                        if (it.length > 3)
                            viewModel.getSearchResults(it)
                    }
                }
                .launchIn(lifecycleScope)

            rvSearchResults.adapter = searchListAdapter
            viewModel.searchResultsLiveData.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    DataWrapper.Status.LOADING -> {
                        tvYouCanSearchForNewsUsingPhrases.visibility = View.GONE
                    }
                    DataWrapper.Status.SUCCESS -> {
                        tvYouCanSearchForNewsUsingPhrases.visibility = View.GONE
                        searchListAdapter.setItems(it.data?.response?.results as MutableList<Results>)
                    }
                    DataWrapper.Status.ERROR -> {
                        Utils.showToast(requireContext(), "${it.message}")
                    }
                }
            })
        }


    }

    override fun onClick(v: View?) {
        when (v) {
            binding.ivClose -> {
                hideKeyboard()
                binding.root.visibility = View.GONE
                activity?.onBackPressed()
            }
        }
    }

    @ExperimentalCoroutinesApi
    @CheckResult
    fun EditText.textChanges(): Flow<String?> {
        return callbackFlow<String?> {
            val listener = object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (s.toString().trim().isNotEmpty())
                        offer(s.toString().trim())
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) = Unit

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                }
            }
            addTextChangedListener(listener)
            awaitClose { removeTextChangedListener(listener) }
        }.onStart { emit(text.toString()) }
    }

}