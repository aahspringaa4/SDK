package com.example.sdk_project.ui.postdetail.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.auth.LoginRepository
import com.example.sdk_project.data.postdetail.PostRepository
import com.example.sdk_project.ui.createpost.dto.CreatePostRequestDTO
import kotlin.properties.Delegates

class PostDetailViewModel(
    private val rp: PostRepository
) : ViewModel() {
    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Boolean> = MutableLiveData()

    private var id by Delegates.notNull<Int>()

    fun readPostDetail() {
        rp.readPostDetail(id).subscribe { response ->
            if(response.isSuccessful) {
                success.value = true
            } else {
                failed.value = true
            }
        }
    }
}