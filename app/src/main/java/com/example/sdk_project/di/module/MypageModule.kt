package com.example.sdk_project.di.module

import com.example.sdk_project.data.mypage.MypageRepository
import com.example.sdk_project.ui.mypage.viewmodel.MypageViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MypageModule = module {
    single { MypageRepository() }
    viewModel { MypageViewModel(get()) }
}