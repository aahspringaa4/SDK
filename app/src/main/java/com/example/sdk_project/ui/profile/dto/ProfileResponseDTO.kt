package com.example.sdk_project.ui.profile.dto

import com.google.gson.annotations.SerializedName

data class ProfileResponseDTO (
    @SerializedName("post_list") val post_list: List<PostList>,
    @SerializedName("name") val myName: String,
    @SerializedName("image") val myImage: String,
    @SerializedName("school") val mySchool: String
){
    data class PostList(
        @SerializedName("post_id") val postId: Int,
        @SerializedName("title") val title: String,
        @SerializedName("content") val content: String,
        @SerializedName("category") val category: String,
        @SerializedName("url") val URL: String,
        @SerializedName("create_at") val createAt: String
    )
}
