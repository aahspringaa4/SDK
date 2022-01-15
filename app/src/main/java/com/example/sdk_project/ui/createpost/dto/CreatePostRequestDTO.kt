package com.example.sdk_project.ui.createpost.dto

import com.google.gson.annotations.SerializedName

data class CreatePostRequestDTO(
    @SerializedName("title") val postTitle: String,
    @SerializedName("content") val postContent: String,
    @SerializedName("category") val category: String
)