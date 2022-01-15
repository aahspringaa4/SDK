package com.example.sdk_project.data.main

import com.example.sdk_project.ui.main.dto.CategoryResponseDTO
import com.example.sdk_project.ui.main.dto.MainResponseDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface MainApi {
    @GET("post")
    fun readPostList(
        @Header("Authorization") accessToken: String,
    ) : Single<Response<MainResponseDTO>>

    @POST("post/category")
    fun categoryPostList(
        @Header("Authorization") accessToken: String,
        @Body category: String
    ) : Single<Response<CategoryResponseDTO>>
}