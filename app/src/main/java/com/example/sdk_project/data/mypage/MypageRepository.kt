package com.example.sdk_project.data.mypage

import com.example.sdk_project.data.ACCESS_TOKEN
import com.example.sdk_project.data.myPageApi
import com.example.sdk_project.ui.mypage.dto.MypageResponseDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class MypageRepository {
    fun readMyPage() : @NonNull Single<Response<MypageResponseDTO>> =
        myPageApi.readMyPage(ACCESS_TOKEN)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}