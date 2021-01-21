package com.sagarock101.categories.viewmodel

import androidx.lifecycle.LiveData
import com.sagarock101.categories.data.SourceRepo
import com.sagarock101.categories.model.Sources
import com.sagarock101.core.data.DataWrapper
import com.sagarock101.core.viewmodel.CoroutineViewModel
import kotlinx.coroutines.Dispatchers.Main
import javax.inject.Inject

class SourceViewModel @Inject constructor(): CoroutineViewModel(Main) {

    @Inject
    lateinit var sourceRepo : SourceRepo

    suspend fun getSources(): LiveData<DataWrapper<Sources>> {
        return sourceRepo.getSource()
    }
}