package com.example.visprogalp_granautismo.model

data class User(
    val name: String = "",
    val email: String = "",
    val email_verified_at: String = "", // Nullable timestamp
    val password: String= "",
    val bio: String = "", // Nullable text
    val location: String = "", // Nullable string
    val display_name: String = "",
    val tag_name: String = "",
    val profile_picture: String = "" // Nullable string
)
{}
