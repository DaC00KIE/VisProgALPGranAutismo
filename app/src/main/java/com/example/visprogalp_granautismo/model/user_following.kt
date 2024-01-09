package com.example.visprogalp_granautismo.model

data class user_following(
    val id: Long, // Assuming it's an auto-incrementing ID
    val following: Int,
    val follower: Int,
    val createdAt: String?, // Timestamps can be represented as strings or using a specific date/time type
    val updatedAt: String? // Timestamps can be represented as strings or using a specific date/time type
)
{}