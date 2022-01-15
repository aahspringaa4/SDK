package com.example.sdk_project.ui.main.dto

import com.google.gson.annotations.SerializedName

data class MainResponseDTO(
    @SerializedName("post") val post: List<PostList>
){
    data class PostList(
        @SerializedName("id") val postId: Int,
        @SerializedName("title") val postTitle: String,
        @SerializedName("url") val postUrl: String,
        @SerializedName("category") val postCategory: String,
        @SerializedName("user") val writer: String,
        @SerializedName("createAt") val createAt: String
    )
}