package com.sagarock101.core.view

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.embibe.core.view.BaseFragment
import com.sagarock101.core.viewmodel.CoroutineViewModel

abstract class BaseViewModelFragment<B : ViewDataBinding, VM : CoroutineViewModel> : BaseFragment() {

    protected lateinit var binding: B
    protected lateinit var viewModel: VM
    protected var bundle: Bundle? = null

//    @Inject
//    lateinit var persistenceManager: PersistenceManager

    override fun bindView(inflater: LayoutInflater, container: ViewGroup?): View {
        return binding.root
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding = DataBindingUtil.inflate<B>(inflater, getLayout(), container, false)
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

    fun wipeData() {
//        val locale: String =
//            persistenceManager.getStringToPreferences(PersistenceManager.PREF_LOCALE)
//        val assetsVersion: Int =
//            persistenceManager.getIntToPreferences(PersistenceManager.PREF_KEY_ASSETS_VERSION)
//        val dbVersion: Int =
//            persistenceManager.getIntToPreferences(PersistenceManager.KEY_DB_VERSION)
//        persistenceManager.saveStringToPrefrence(PersistenceManager.PREF_LOCALE, locale)
//        persistenceManager.saveIntToPrefrence(
//            PersistenceManager.PREF_KEY_ASSETS_VERSION,
//            assetsVersion
//        )
//        persistenceManager.saveIntToPrefrence(PersistenceManager.KEY_DB_VERSION, dbVersion)

//        Delete.from(QuestionSetItem.class).execute(false);

//        Delete.from(QuestionSetItem.class).execute(false);
//        repoProvider.getTestRepo().deleteAllTest()
//        repoProvider.getCommonRepo().deleteAllQuestion()
//        repoProvider.getCommonRepo().deleteAllConcept()
//        repoProvider.getCommonRepo().deleteAllPack()
//        repoProvider.getCommonRepo().deleteAllAttempts()
//        repoProvider.getTestRepo().deleteAllInstruction()
//        repoProvider.getCommonRepo().deleteAllSection()
//        repoProvider.getPracticeRepo().deleteAllPractice()
//        repoProvider.getPracticeRepo().deleteAllChapters()
//        repoProvider.getCommonRepo().deleteAllEvent()
//        repoProvider.getCommonRepo().deleteAllFormat()
//        TestManager.getInstance().reset()
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

}