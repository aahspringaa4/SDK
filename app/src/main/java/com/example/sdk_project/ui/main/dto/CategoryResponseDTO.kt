package com.example.sdk_project.ui.main.dto

import com.google.gson.annotations.SerializedName

data class CategoryResponseDTO(
    @SerializedName("posts") val posts: PostList
){
    data class PostList(
        @SerializedName("id") val postId: Int,
        @SerializedName("title") val title: String,
        @SerializedName("content") val content: String,
        @SerializedName("url") val URL: String,
        @SerializedName("user") val writer: String
    )
}