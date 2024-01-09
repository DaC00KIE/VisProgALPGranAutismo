package com.example.visprogalp_granautismo.model

data class Bookmark(
    val id: Long, // Assuming it's an auto-incrementing ID
    val user_id: Int,
    val post_id: Int,
    val createdAt: String?, // Timestamps can be represented as strings or using a specific date/time type
)
