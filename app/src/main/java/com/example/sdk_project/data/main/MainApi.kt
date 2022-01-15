package com.example.sdk_project.data.main

import com.example.sdk_project.ui.main.dto.MainResponseDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface MainApi {
    @GET("post")
    fun readPostList(
        @Header("Authorization") accessToken: String
    ) : Single<Response<MainResponseDTO>>
}