package com.example.sdk_project.di.module

import com.example.sdk_project.data.auth.LoginRepository
import com.example.sdk_project.data.auth.RegisterRepository
import com.example.sdk_project.ui.auth.viewmodel.LoginViewModel
import com.example.sdk_project.ui.auth.viewmodel.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val AuthModule = module {
    single { LoginRepository() }
    viewModel { LoginViewModel(get()) }

    single { RegisterRepository() }
    viewModel { RegisterViewModel(get()) }
}