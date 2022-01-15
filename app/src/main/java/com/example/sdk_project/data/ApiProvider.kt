package com.example.sdk_project.data

import com.example.sdk_project.data.auth.AuthApi
import com.example.sdk_project.data.createpost.CreatePostApi
import com.example.sdk_project.data.main.MainApi
import com.example.sdk_project.data.mypage.MyPageApi
import com.example.sdk_project.data.postdetail.PostApi
import com.example.sdk_project.data.profile.ProfileApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit: Retrofit = Retrofit.Builder().apply {
    baseUrl(BASE_URL)
    addCallAdapterFactory(RxJava3CallAdapterFactory.create())
    addConverterFactory(GsonConverterFactory.create())
}.build()

val authApi : AuthApi by lazy {
    retrofit.create(AuthApi::class.java)
}

val createPostApi : CreatePostApi by lazy {
    retrofit.create(CreatePostApi::class.java)
}

val mainApi : MainApi by lazy {
    retrofit.create(MainApi::class.java)
}

val myPageApi : MyPageApi by lazy {
    retrofit.create(MyPageApi::class.java)
}

val postApi : PostApi by lazy {
    retrofit.create(PostApi::class.java)
}

val profileApi: ProfileApi by lazy{
    retrofit.create(ProfileApi::class.java)
}