package com.example.sdk_project.ui.mypage.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.auth.LoginRepository
import com.example.sdk_project.data.mypage.MypageRepository

class MypageViewModel(
    private val rp: MypageRepository
) : ViewModel() {
    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Boolean> = MutableLiveData()
    fun readMyPage() {
        rp.readMyPage().subscribe { response ->
            if(response.isSuccessful) {
                success.value = true
            } else {
                failed.value = true
            }
        }
    }
}