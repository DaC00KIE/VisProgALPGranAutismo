package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.main_feed_screen.BottomBar
import com.example.visprogalp_granautismo.ui.theme.LightPurple
import com.synac.instagramuipractice.loginpage.NavBar
import com.synac.instagramuipractice.model.User

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun Explore() {
    var searchQuery by remember { mutableStateOf("") }

    val users = listOf(
        User(
            profilePic = painterResource(R.drawable.user1),
            username = "Cranberry Pie",
            location = "2 days ago",
            postPic = painterResource(R.drawable.post1),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "30m ago",
        ),
        User(
            profilePic = painterResource(R.drawable.image21),
            username = "Vanilla Ice",
            location = "6 days ago",
            postPic = painterResource(R.drawable.image45),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "20m ago",
        ),

        User(
            profilePic = painterResource(R.drawable.image19),
            username = "CookiesMilky",
            location = "4 days ago",
            postPic = painterResource(R.drawable.image47),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 12,
            commentTime = "10m ago",
        ),
        User(
            profilePic = painterResource(R.drawable.image21),
            username = "Marshmellow",
            location = "3 days ago",
            postPic = painterResource(R.drawable.post1),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "30m ago",
        ),
        User(
            profilePic = painterResource(R.drawable.user1),
            username = "Cranberry Pie2",
            location = "5 days ago",
            postPic = painterResource(R.drawable.post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "40m ago",
        ),
        User(
            profilePic = painterResource(R.drawable.image19),
            username = "SuperCream",
            location = "9 days ago",
            postPic = painterResource(R.drawable.post1),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "30m ago",
        ),
        User(
            profilePic = painterResource(R.drawable.image21),
            username = "WaffleChoco",
            location = "7 days ago",
            postPic = painterResource(R.drawable.image45),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "50m ago",
        ),
        User(
            profilePic = painterResource(R.drawable.user1),
            username = "Yupi",
            location = "8 days ago",
            postPic = painterResource(R.drawable.post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "25m ago",
        )
    )

    Scaffold(
        topBar = {
            TopBar(searchQuery = searchQuery) {
                searchQuery = it
            }
        },
        containerColor = Color.White,
        bottomBar = { BottomBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            LazyVerticalGrid(
                GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(8.dp)
            ) {
                items(users) { user ->
                    Spacer(modifier = Modifier.height(8.dp))
                    PostWidget2(user = user)
//                    Divider()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(searchQuery: String, onSearchQueryChange: (String) -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            TextField(
                value = searchQuery,
                onValueChange = { onSearchQueryChange(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(MaterialTheme.colorScheme.primary),

                leadingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.search),
                        tint = LightPurple,
                        contentDescription = "Search Icon",
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .size(25.dp)
                    )
                },
                placeholder = {
                    Text(
                        text = "Search",
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 17.51.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(600),
                            color = Color(0xFF65598E),
                            textAlign = TextAlign.Center,
                        )
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExplorePreview() {
    Explore()
    NavBar()
}