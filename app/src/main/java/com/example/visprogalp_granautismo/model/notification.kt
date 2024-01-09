package com.example.visprogalp_granautismo.model



data class Notification(
    val id: Int,
    val message: String,
    val time: String,
    val follow: Boolean,
    val like: Boolean
)

val notification_list = listOf(
    Notification(
        1,
        "Liked Your Post",
        "12:15 PM",
        false,
        true
    ),
    Notification(
        2,
        "Followed You",
        "12:18 PM",
        true,
        false
    ),
    Notification(
        3,
        "Commented On Your Post: Wow That looks so delicious",
        "12:21 PM",
        false,
        false
    ),
    Notification(
        4,
        "Followed You",
        "12:23 PM",
        true,
        false
    ),
    Notification(
        5,
        "Liked Your Post",
        "12:26 PM",
        false,
        true
    ),
    Notification(
        6,
        "Liked Your Post",
        "12:28 PM",
        false,
        true
    ),
    Notification(
        7,
        "Liked Your Post",
        "12:29 PM",
        false,
        true
    ),
    Notification(
        8,
        "Commented On Your Post: Amazing 🔥🔥🔥",
        "12:31 PM",
        false,
        false
    ),
    Notification(
        9,
        "Liked Your Post",
        "12:34 PM",
        false,
        true
    ),
    Notification(
        10,
        "Followed You",
        "12:38 PM",
        true,
        false
    ),
)
