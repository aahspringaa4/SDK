package com.example.sdk_project.data.auth

import com.example.sdk_project.data.authApi
import com.example.sdk_project.ui.auth.dto.RegisterRequestDTO
import com.example.sdk_project.ui.auth.dto.RegisterResponseDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class RegisterRepository {
    fun register(registerRequestDTO: RegisterRequestDTO) : @NonNull Single<Response<RegisterResponseDTO>> =
        authApi.postRegister(registerRequestDTO)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}