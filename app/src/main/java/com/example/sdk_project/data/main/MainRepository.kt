package com.example.sdk_project.data.main

import com.example.sdk_project.data.ACCESS_TOKEN
import com.example.sdk_project.data.mainApi
import com.example.sdk_project.ui.main.dto.MainResponseDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class MainRepository {
    fun readPostList() : @NonNull Single<Response<MainResponseDTO>> =
        mainApi.readPostList(ACCESS_TOKEN)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}