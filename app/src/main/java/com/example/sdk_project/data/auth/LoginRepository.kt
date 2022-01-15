package com.example.sdk_project.data.auth

import com.example.sdk_project.data.authApi
import com.example.sdk_project.ui.auth.dto.LoginRequestDTO
import com.example.sdk_project.ui.auth.dto.LoginResponseDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class LoginRepository {
    fun login(loginRequestDTO: LoginRequestDTO) : @NonNull Single<Response<LoginResponseDTO>> =
        authApi.postLogin(loginRequestDTO)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}