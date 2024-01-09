package com.example.visprogalp_granautismo.model

import androidx.compose.ui.graphics.painter.Painter

data class User(
    val username: String = "",
    val email: String = "",
    val password: String= "",
    val bio: String = "", // Nullable text
    val location: String = "", // Nullable string
    val displayName: String = "",
    val profilePic:  Painter? = null,
    val commentTime: String = "", // Nullable string
    val caption: String = "", // Nullable string
    val commentCount: Int = 0, // Nullable string
    val likeCount: Int = 0, // Nullable string
    val postPic: Painter? = null // Nullable string
)
{}
