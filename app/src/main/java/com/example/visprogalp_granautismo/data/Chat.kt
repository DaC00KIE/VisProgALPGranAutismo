package com.example.visprogalp_granautismo.data


data class Chat(
    val id:Int,
    val message: String,
    val time:String,
    val direction:Boolean
)

val chatList = listOf(
    Chat(
        1,
        "Hey! Check out this recipe",
        "12:15 PM",
        true
    ),
    Chat(
        2,
        "Wow that looks so delicious",
        "12:17 PM",
        false
    ),
    Chat(
        3,
        "Yeah! Wanna try and make it?",
        "12:18 PM",
        true
    ),
    Chat(
        4,
        "Sure! Wanna try and make it at my place?",
        "12:20 PM",
        false
    ),
    Chat(
        5,
        "Alright! When Should we make it?",
        "12:23 PM",
        true
    ),
    Chat(
        6,
        "Hmm.. how about tomorrow?",
        "12:25 PM",
        false
    ),
    Chat(
        7,
        "Ok! I'll bring the ingridients",
        "12:26 PM",
        true
    ),
    Chat(
        8,
        "I'll bring some stuff too",
        "12:28 PM",
        false
    ),
    Chat(
        9,
        "Ok see you tomorrow",
        "12:30 PM",
        true
    ),
    Chat(
        10,
        "Alright! See you",
        "12:32 PM",
        false
    ),
)