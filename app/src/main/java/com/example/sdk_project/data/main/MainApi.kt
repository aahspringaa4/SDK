package com.example.sdk_project.data.main

import com.example.sdk_project.ui.createpost.dto.CreatePostRequestDTO
import com.example.sdk_project.ui.createpost.dto.CreatePostResponseDTO
import com.example.sdk_project.ui.main.dto.MainRequestDTO
import com.example.sdk_project.ui.main.dto.MainResponseDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface MainApi {
    @GET("post")
    fun readPostList(
        @Query("id") id: Int,
        @Body mainRequestDTO: MainRequestDTO
    ) : Single<Response<MainResponseDTO>>
}