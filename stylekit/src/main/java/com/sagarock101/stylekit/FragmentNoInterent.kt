package com.sagarock101.stylekit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sagarock101.stylekit.databinding.LayoutNoNetworkBinding

class FragmentNoInterent : Fragment() {

    lateinit var binding: LayoutNoNetworkBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LayoutNoNetworkBinding.inflate(inflater)
        return binding.root
    }
}