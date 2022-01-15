package com.example.sdk_project.ui.createpost.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.ACCESS_TOKEN
import com.example.sdk_project.data.REFRESH_TOKEN
import com.example.sdk_project.data.createpost.CreatePostRepository
import com.example.sdk_project.data.profile.ProfileRepository
import com.example.sdk_project.ui.auth.dto.LoginRequestDTO
import com.example.sdk_project.ui.createpost.dto.CreatePostRequestDTO

class CreatePostViewModel(
    private val rp: CreatePostRepository
) : ViewModel() {
    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Boolean> = MutableLiveData()

    fun createPost(createPostRequestDTO: CreatePostRequestDTO) {
        rp.createPost(createPostRequestDTO).subscribe { response ->
            if(response.isSuccessful) {
                success.value = true
            } else {
                failed.value = true
            }
        }
    }
}