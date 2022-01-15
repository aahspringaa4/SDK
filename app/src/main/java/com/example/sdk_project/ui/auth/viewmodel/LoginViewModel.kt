package com.example.sdk_project.ui.auth.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.ACCESS_TOKEN
import com.example.sdk_project.data.auth.LoginRepository
import com.example.sdk_project.ui.auth.dto.LoginRequestDTO

class LoginViewModel(
    private val rp: LoginRepository
) : ViewModel() {
    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Boolean> = MutableLiveData()

    fun login(loginRequestDTO: LoginRequestDTO) {
        rp.login(loginRequestDTO).subscribe { response ->
            if(response.isSuccessful) {
                ACCESS_TOKEN = "Bearer " + response.body()?.accessToken.toString()
                success.value = true
            } else {
                failed.value = true
            }
        }
    }
}