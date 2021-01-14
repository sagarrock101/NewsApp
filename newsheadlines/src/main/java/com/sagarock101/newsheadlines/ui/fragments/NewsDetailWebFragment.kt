package com.sagarock101.newsheadlines.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailWebBinding

class NewsDetailWebFragment : Fragment() {

    lateinit var binding: FragmentNewsDetailWebBinding

    private var url: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsDetailWebBinding.inflate(inflater)
        setWebView()
        return binding.root
    }

    private fun setWebView() {
        url?.let {
            binding.webView.webViewClient = WebViewClient()
            binding.webView.loadUrl(it)
        }
    }

    fun setUrl(url: String) {
        this.url = url
    }
}