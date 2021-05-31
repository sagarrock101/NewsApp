package com.sagarock101.core.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

open class CoroutineViewModel(
    private val mainDispatcher: CoroutineDispatcher
): ViewModel() {
    private val job = Job()
    private val scope = CoroutineScope(job + mainDispatcher)

    protected fun launch(
        context: CoroutineContext = mainDispatcher,
        start: CoroutineStart = CoroutineStart.DEFAULT,
        block: suspend CoroutineScope.() -> Unit
    ) = scope.launch(context, start, block)

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}