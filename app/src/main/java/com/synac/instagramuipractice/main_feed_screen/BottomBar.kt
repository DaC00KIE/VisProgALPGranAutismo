package com.example.visprogalp_granautismo.main_feed_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar


import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG


@Composable
fun BottomBar() {
    BottomAppBar(
        modifier = Modifier.background(color = LightPinkBG)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_home_filled),
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_search),
                    contentDescription = "Search Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_reels_outline),
                    contentDescription = "Reels Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_like_outline),
                    contentDescription = "Like Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Image(
                    painter = painterResource(R.drawable.jon_snow),
                    contentDescription = "Profile Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                )
            }
        )
    }
}