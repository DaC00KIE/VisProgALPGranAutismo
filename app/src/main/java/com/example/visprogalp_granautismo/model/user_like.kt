package com.example.visprogalp_granautismo.model

data class user_like(
    val id: Long, // Assuming it's an auto-incrementing ID
    val user: Int,
    val post: Int,
    val createdAt: String?, // Timestamps can be represented as strings or using a specific date/time type
    val updatedAt: String? // Timestamps can be represented as strings or using a specific date/time type
)
