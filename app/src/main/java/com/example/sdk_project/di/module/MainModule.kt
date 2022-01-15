package com.example.sdk_project.di.module

import com.example.sdk_project.data.main.MainRepository
import com.example.sdk_project.ui.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MainModule = module {
    single { MainRepository() }
    viewModel { MainViewModel(get()) }
}