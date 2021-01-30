package com.sagarock101.core.view

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.sagarock101.core.utils.Utils
import com.sagarock101.core.viewmodel.CoroutineViewModel

abstract class BaseViewModelFragment<B : ViewDataBinding, VM : CoroutineViewModel> : BaseFragment() {

    protected lateinit var binding: B
    protected lateinit var viewModel: VM
    protected var bundle: Bundle? = null

    override fun bindView(inflater: LayoutInflater, container: ViewGroup?): View {
        return binding.root
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding = DataBindingUtil.inflate<B>(inflater, getLayout(), container, false)
        setHasOptionsMenu(true)
        this.binding = dataBinding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readBundle()
        initView(view)
    }

    abstract fun getLayout(): Int

    abstract fun initView(view: View)

    protected fun readBundle() {
        bundle = this.arguments
    }


    fun hideKeyboard() {
        activity?.let {
            val imm: InputMethodManager =
                it.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            var view = it.currentFocus
            if (view == null) {
                view = View(activity)
            }
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun showToast(msg: String) {
        Utils.showToast(requireContext(), msg)
    }


}