package com.sagarock101.core.view

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.viewmodel.BaseViewModel
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
/**
 * Created by Anil Gudigar on 25,September,2020
 */
abstract class BaseViewModelActivity<B : ViewDataBinding, VM : BaseViewModel> : BaseActivity() {


    protected var viewModel: VM? = null
    protected lateinit var binding: B
    lateinit var TAG: String

    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG = javaClass.simpleName
        //init data binding
        binding = DataBindingUtil.setContentView(this, layout)
        initViews()
    }

    protected abstract fun initViews()

    override fun shouldUseDataBinding(): Boolean {
        return true
    }

    /**
     * Default state handling, can be override
     * This method will be called when viewmodel returns the livedata
     *
     * @param wrapper
     */
    protected fun handleState(wrapper: DataWrapper<Any>?) {
        setLoading(wrapper != null && wrapper.status.equals(DataWrapper.Status.LOADING))
        handleData(wrapper)
    }

    protected abstract fun handleData(dataWrapper: DataWrapper<Any>?)

}
