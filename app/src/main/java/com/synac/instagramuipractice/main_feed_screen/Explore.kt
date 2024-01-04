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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.main_feed_screen.BottomBar
import com.synac.instagramuipractice.model.User

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun Explore() {
    var searchQuery by remember { mutableStateOf("") }

    val users = listOf(
        User(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "jon_snow",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.jon_snow_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.arya_stark),
            username = "arya_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.arya_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),

        User(
            profilePic = painterResource(R.drawable.bran_stark),
            username = "bran_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.bran_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.daenerys_targaryen),
            username = "queen_daenerys",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.daenerys_targaryen_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.jorah_mormont),
            username = "jorah_m",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.jorah_mormont_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.rob_stark),
            username = "robb_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.robb_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.sansa_stark),
            username = "sansa_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.sansa_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(R.drawable.tyrian_lannister),
            username = "tyrian_lan",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.tyrian_lannister_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
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
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colorScheme.primary),

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Icon"
                    )
                },
                placeholder = {
                    Text(text = "Search for captions...")
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExplorePreview() {
    Explore()
}