package com.sagarock101.search.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.annotation.CheckResult
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.di.ViewModelFactory
import com.sagarock101.core.di.injectViewModel
import com.sagarock101.core.utils.Utils
import com.sagarock101.core.view.BaseViewModelFragment
import com.sagarock101.search.R
import com.sagarock101.search.databinding.FragmentSearchBinding
import com.sagarock101.search.interfaces.OnSpeechRecognitionPermissionGrantedListener
import com.sagarock101.search.model.Articles
import com.sagarock101.search.model.Results
import com.sagarock101.search.ui.activity.SearchActivity
import com.sagarock101.search.ui.adapters.SearchResultsAdapter
import com.sagarock101.search.ui.viewmodel.SearchViewModel
import com.sagarock101.stylekit.binding.changeStatusBarBasedOnTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class SearchResultsFragment : BaseViewModelFragment<FragmentSearchBinding, SearchViewModel>(),
    View.OnClickListener, OnSpeechRecognitionPermissionGrantedListener {

    private var countDownTimer: CountDownTimer? = null
    private var listener: TextWatcher? = null
    private var speechRecognitionListener: RecognitionListener? = null
    private var speechRecognizer: SpeechRecognizer? = null
    lateinit var searchListAdapter: SearchResultsAdapter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun getLayout() = R.layout.fragment_search


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchListAdapter = SearchResultsAdapter()
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(requireContext())
    }

    override fun isNetworkActive(isActive: Boolean) {

    }

    override fun onResume() {
        super.onResume()
        binding.etSearch.addTextChangedListener(listener)
        setUpSpeechRecognition()
    }

    @FlowPreview
    @ExperimentalCoroutinesApi
    override fun initView(view: View) {
        changeStatusBarBasedOnTheme()
        viewModel = injectViewModel(viewModelFactory)
        with(binding) {
            ivClose.setOnClickListener(this@SearchResultsFragment)
            ivSearchIcon.setOnClickListener(this@SearchResultsFragment)
            vm = viewModel
            lifecycleOwner = this@SearchResultsFragment
            etSearch.textChanges()
                .debounce(1200)
                .distinctUntilChanged()
                .filterNot { it.isNullOrBlank() || it.length == 3 }
                .onEach {
                    it?.let {
                        if (it.length >= 3) {
                            hideKeyboard()
                            viewModel.getSearchResults(it)
                        }
                    }
                }
                .launchIn(lifecycleScope)
            rvSearchResults.apply {
                adapter = searchListAdapter
                postponeEnterTransition()
                viewTreeObserver
                    .addOnPreDrawListener {
                        startPostponedEnterTransition()
                        true
                    }
            }
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
        setListItemClickListner()
    }

    private fun setListItemClickListner() {
        var extras: FragmentNavigator.Extras?
        searchListAdapter.onItemClick = { newsImageView, newsDetailsTextview, newsPublicatoinDateTV, data ->
            val directions =
                SearchResultsFragmentDirections.actionSearchResultsFragmentToSearchDetailFragment(
                    data
                )
            extras = FragmentNavigatorExtras(
                newsImageView to ViewCompat.getTransitionName(newsImageView)!!,
                newsDetailsTextview to ViewCompat.getTransitionName(newsDetailsTextview)!!,
                newsPublicatoinDateTV to ViewCompat.getTransitionName(newsPublicatoinDateTV)!!
            )
//            viewModel.lastSelectedChipId = binding.chipGroup.checkedChipId
            findNavController().navigate(
                directions,
                extras ?: FragmentNavigatorExtras()
            )
        }
    }

    private fun setUpSpeechRecognition() {
        speechRecognitionListener = object : RecognitionListener {
            override fun onReadyForSpeech(params: Bundle?) {

            }

            override fun onRmsChanged(rmsdB: Float) {

            }

            override fun onBufferReceived(buffer: ByteArray?) {
            }

            override fun onPartialResults(partialResults: Bundle?) {
            }

            override fun onEvent(eventType: Int, params: Bundle?) {
            }

            override fun onBeginningOfSpeech() {
                binding.etSearch.setText("")
                startAnimateListeningText()
            }

            override fun onEndOfSpeech() {
                endAnimateListeningText()
            }

            override fun onError(error: Int) {
            }

            override fun onResults(results: Bundle?) {
                val speechList =
                    results?.get(SpeechRecognizer.RESULTS_RECOGNITION) as? ArrayList<String>
                binding.etSearch.setText(speechList?.get(0))
                binding.etSearch.setSelection(binding.etSearch.text.toString().length)
                speechRecognizer?.stopListening()
            }
        }
        speechRecognizer?.setRecognitionListener(speechRecognitionListener)

    }

    private fun endAnimateListeningText() {

    }

    private fun startAnimateListeningText() {
        countDownTimer = object : CountDownTimer(2000, 200) {
            override fun onFinish() {
                binding.tvListening.visibility = View.GONE
                speechRecognizer?.stopListening()
                countDownTimer?.cancel()
            }

            override fun onTick(millisUntilFinished: Long) {
                binding.tvListening.visibility = View.VISIBLE
                with(binding.tvListening) {
                    when {
                        this.text.toString().isEmpty() -> this.text = "Listening"
                        this.text.toString().equals("Listening...") -> {
                            this.text = "Listening."
                        }
                        else -> this.text = this.text.toString() + "."
                    }
                }

            }
        }

        countDownTimer?.start()
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.ivClose -> {
                hideKeyboard()
                binding.root.visibility = View.GONE
                activity?.onBackPressed()
            }
            binding.ivSearchIcon -> {
                speechRecognizer?.startListening(getRecognizerIntent())
            }
        }
    }

    private fun getRecognizerIntent(): Intent? {
        return Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
    }

    @ExperimentalCoroutinesApi
    @CheckResult
    fun EditText.textChanges(): Flow<String?> {
        return callbackFlow<String?> {
            listener = object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (s.toString().trim().isNotEmpty()) {
                        offer(s.toString().trim())
                    }
                    binding.tvListening.text = ""
                    binding.tvListening.visibility = View.GONE
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
            awaitClose {
                removeTextChangedListener(listener)
            }
        }.onStart { emit(text.toString()) }
    }

    override fun onPause() {
        speechRecognizer?.stopListening()
        binding.etSearch.removeTextChangedListener(listener)
        super.onPause()
    }

    override fun startSpeechRecognition() {
        speechRecognizer?.startListening(getRecognizerIntent())
    }

    override fun stopSpeechRecognition() {
        speechRecognizer?.stopListening()
    }

    override fun onDestroyView() {
        searchListAdapter.onItemClick = null
        binding.rvSearchResults.layoutManager = null
        binding.rvSearchResults.adapter = null
        super.onDestroyView()
    }

    override fun onDestroy() {
        listener = null
        speechRecognizer = null
        speechRecognitionListener = null
        countDownTimer = null
        super.onDestroy()
    }

}