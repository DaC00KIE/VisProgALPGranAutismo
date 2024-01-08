package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.main_feed_screen.BottomBar

import com.synac.instagramuipractice.model.User

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun MainFeedScreen() {

    val users = listOf(
        User(
            profilePic = painterResource(R.drawable.user1),
            username = "Cranberry Pie",
            location = "Jakarta, Indonesia",
            postPic = painterResource(R.drawable.post1),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.pp3),
            username = "Marshmellow",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.bgpp2),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "2h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.pp5),
            username = "Choco",
            location = "Surabaya",
            postPic = painterResource(R.drawable.bgprofile),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "3h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.pp1),
            username = "Blue Tea",
            location = "Kendari",
            postPic = painterResource(R.drawable.bgprofile),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.user1),
            username = "Chips",
            location = "Aceh",
            postPic = painterResource(R.drawable.bgpp2),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.pp7),
            username = "Manado",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.post1  ),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "5h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.pp6),
            username = "Waffle",
            location = "Bandung",
            postPic = painterResource(R.drawable.post1),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.pp9),
            username = "Roasted Chicken",
            location = "Makassar",
            postPic = painterResource(R.drawable.bgpp2),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "2h ago"
        )
    )

    Scaffold(
        topBar = { TopBar() },
        containerColor = Color.White,
        bottomBar = { BottomBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                LazyRow {
                    items(users) { user ->

                    }
                }
            }
            item { Divider() }
            items(users) { user ->
                PostWidget(user = user)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}


