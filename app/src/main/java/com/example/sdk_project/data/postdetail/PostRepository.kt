package com.example.sdk_project.data.postdetail

import com.example.sdk_project.data.ACCESS_TOKEN
import com.example.sdk_project.data.postApi
import com.example.sdk_project.ui.postdetail.dto.PostResponseDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class PostRepository {
    fun readPostDetail(id: Int) : @NonNull Single<Response<PostResponseDTO>> =
        postApi.readPostDetail(id, ACCESS_TOKEN)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}