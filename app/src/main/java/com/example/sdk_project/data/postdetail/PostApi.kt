package com.example.sdk_project.data.postdetail

import com.example.sdk_project.ui.main.dto.MainResponseDTO
import com.example.sdk_project.ui.postdetail.dto.PostResponseDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface PostApi {
    @GET("post")
    fun readPostDetail(
        @Query("id") id: Int,
        @Header("Authorization") accessToken: String
    ) : Single<Response<PostResponseDTO>>
}