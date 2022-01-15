package com.example.sdk_project.data.auth

import com.example.sdk_project.ui.auth.dto.LoginRequestDTO
import com.example.sdk_project.ui.auth.dto.LoginResponseDTO
import com.example.sdk_project.ui.auth.dto.RegisterRequestDTO
import com.example.sdk_project.ui.auth.dto.RegisterResponseDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("user/signup")
    fun postRegister(
        @Body registerRequestDTO: RegisterRequestDTO
    ): Single<Response<RegisterResponseDTO>>

    @POST("user/signin")
    fun postLogin(
        @Body loginRequestDTO: LoginRequestDTO
    ): Single<Response<LoginResponseDTO>>
}