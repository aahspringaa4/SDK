package com.example.sdk_project.di.module

import com.example.sdk_project.data.postdetail.PostRepository
import com.example.sdk_project.ui.postdetail.viewmodel.PostDetailViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val PostDetailModule = module {
    single { PostRepository() }
    viewModel { PostDetailViewModel(get()) }
}