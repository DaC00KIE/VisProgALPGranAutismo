package com.example.visprogalp_granautismo.model

data class Post(
    val user_id: Int,
    val image: String,
    val title: String,
    val caption: String,
) {
}

data class PostResponse(
    val user_id: Int,
    val image: String,
    val title: String,
    val caption: String
)