package com.example.sdk_project.ui.postdetail.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.auth.LoginRepository
import com.example.sdk_project.data.postdetail.PostRepository

class PostDetailViewModel(
    private val rp: PostRepository
) : ViewModel() {

}