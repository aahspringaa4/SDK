package com.example.sdk_project.di.module

import com.example.sdk_project.data.profile.ProfileRepository
import com.example.sdk_project.ui.profile.viewmodel.ProfileViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val ProfileModule = module {
    single { ProfileRepository() }
    viewModel { ProfileViewModel(get()) }
}