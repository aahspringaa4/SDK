package com.example.sdk_project.ui.postdetail.dto

import com.google.gson.annotations.SerializedName

data class PostResponseDTO (
    @SerializedName("title") val postTitle: String,
    @SerializedName("content") val postContent: String,
    @SerializedName("url") val postUrl: String,
    @SerializedName("category") val postCategory: String,
    @SerializedName("user") val writer:String
)