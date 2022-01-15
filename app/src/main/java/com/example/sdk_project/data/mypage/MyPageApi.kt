package com.example.sdk_project.data.mypage

import com.example.sdk_project.ui.mypage.dto.MypageResponseDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface MyPageApi{
    @GET("user/profile")
    fun readMyPage(
        @Header("Authorization") accessToken: String
    ): Single<Response<MypageResponseDTO>>
}