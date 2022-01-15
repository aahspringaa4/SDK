package com.example.sdk_project.ui.auth.dto

import com.google.gson.annotations.SerializedName

data class LoginRequestDTO(
    @SerializedName("id") val id: Int,
    @SerializedName("password") val password: String
)