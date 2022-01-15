package com.example.sdk_project.ui.auth.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.auth.RegisterRepository
import com.example.sdk_project.ui.auth.dto.RegisterRequestDTO

class RegisterViewModel(
    private val rp: RegisterRepository
) : ViewModel() {

    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<String> = MutableLiveData()

    fun register(registerRequestDTO: RegisterRequestDTO) {
        rp.register(registerRequestDTO).subscribe { response ->
            if(response.isSuccessful) {
                success.value = true
            } else {
                when(response.code()) {
                    409 -> failed.value = "이미 존재하는 계정입니다."
                    else -> failed.value = "회원가입 도중 오류가 발생하였습니다."
                }
            }
        }
    }
}