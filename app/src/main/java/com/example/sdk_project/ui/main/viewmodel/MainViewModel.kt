package com.example.sdk_project.ui.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.auth.RegisterRepository
import com.example.sdk_project.data.main.MainRepository
import com.example.sdk_project.ui.createpost.dto.CreatePostRequestDTO
import kotlin.properties.Delegates

class MainViewModel(
    private val rp: MainRepository
) : ViewModel() {
    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Boolean> = MutableLiveData()

    fun readPostList() {
        rp.readPostList().subscribe { response ->
            if(response.isSuccessful) {
                success.value = true
            } else {
                failed.value = true
            }
        }
    }
}