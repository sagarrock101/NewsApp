package com.sagarock101.newsheadlines.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.sagarock101.newsheadlines.R
import com.sagarock101.newsheadlines.databinding.FragmentNewsDetailViewPagerBinding
import com.sagarock101.newsheadlines.ui.adapter.MyViewPagerAdapter

class NewsDetailViewPagerFragment : Fragment() {

    lateinit var binding: FragmentNewsDetailViewPagerBinding

    val args: NewsDetailViewPagerFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsDetailViewPagerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(context)
            .inflateTransition(android.R.transition.move)
        sharedElementReturnTransition = TransitionInflater.from(context)
            .inflateTransition(R.transition.shared_element_transition)
//        postponeEnterTransition()
        setUpViewPager()
    }

    private fun setUpViewPager() {
        val viewPager = binding.viewPager
        val pagerAdapter = activity?.supportFragmentManager?.let { MyViewPagerAdapter(it, args.article!!) }
        viewPager.adapter = pagerAdapter
    }

}