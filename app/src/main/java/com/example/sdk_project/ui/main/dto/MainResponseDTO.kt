package com.example.sdk_project.ui.main.dto

import com.google.gson.annotations.SerializedName

data class MainResponseDTO(
    @SerializedName("post") val post: PostList
){
    data class PostList(
        @SerializedName("title") val postTitle: String,
        @SerializedName("url") val postUrl: String,
        @SerializedName("category") val postCategory: String,
        @SerializedName("user") val writer:String
    )
}