package com.example.sdk_project.ui.auth.dto

import com.google.gson.annotations.SerializedName

data class LoginResponseDTO(
    @SerializedName("access_token") val accessToken: String,
    @SerializedName("refresh_token") val refreshToken: String
)