package com.example.visprogalp_granautismo.model

import java.util.Date

data class Chat(
    val user_id: Int,
    val post_id: Int,
    val message: String,
    val date: Date
){

}
