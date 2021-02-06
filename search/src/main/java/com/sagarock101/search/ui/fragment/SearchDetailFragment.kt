package com.sagarock101.search.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sagarock101.search.databinding.FragmentDialogSearchBinding

class SearchDetailFragment : Fragment() {

    lateinit var binding: FragmentDialogSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDialogSearchBinding.inflate(inflater)
        return binding.root
    }
}