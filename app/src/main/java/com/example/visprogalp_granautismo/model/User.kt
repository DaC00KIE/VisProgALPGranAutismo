package com.example.visprogalp_granautismo.model

data class User(
    val username: String = "",
    val email: String = "",
    val password: String= "",
    val bio: String = "", // Nullable text
    val location: String = "", // Nullable string
    val displayName: String = "",
    val profilePicture: String = "" // Nullable string
)
{}
