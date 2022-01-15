package com.example.sdk_project.data.createpost

import com.example.sdk_project.data.ACCESS_TOKEN
import com.example.sdk_project.data.createPostApi
import com.example.sdk_project.ui.createpost.dto.CreatePostRequestDTO
import com.example.sdk_project.ui.createpost.dto.CreatePostResponseDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class CreatePostRepository {
    fun createPost(createPostRequestDTO: CreatePostRequestDTO) : @NonNull Single<Response<CreatePostResponseDTO>> =
        createPostApi.createPost(ACCESS_TOKEN, createPostRequestDTO)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}