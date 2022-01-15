package com.example.sdk_project.data.createpost

import com.example.sdk_project.ui.createpost.dto.CreatePostRequestDTO
import com.example.sdk_project.ui.createpost.dto.CreatePostResponseDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface CreatePostApi {
    @POST("post")
    fun createPost(
        @Body createPostRequestDTO: CreatePostRequestDTO
    ) : Single<Response<CreatePostResponseDTO>>
}