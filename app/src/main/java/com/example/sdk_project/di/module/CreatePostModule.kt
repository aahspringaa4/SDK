package com.example.sdk_project.di.module

import com.example.sdk_project.data.createpost.CreatePostRepository
import com.example.sdk_project.data.postdetail.PostRepository
import com.example.sdk_project.ui.createpost.viewmodel.CreatePostViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val CreatePostModule = module {
    single { CreatePostRepository() }
    viewModel { CreatePostViewModel(get()) }
}