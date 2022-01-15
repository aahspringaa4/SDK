package com.example.sdk_project.data.profile

import com.example.sdk_project.data.ACCESS_TOKEN
import com.example.sdk_project.data.profileApi
import com.example.sdk_project.ui.profile.dto.ProfileResponseDTO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class ProfileRepository {
    fun readProfile(userId: String) : @NonNull Single<Response<ProfileResponseDTO>> =
        profileApi.readProfile(ACCESS_TOKEN, userId)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}