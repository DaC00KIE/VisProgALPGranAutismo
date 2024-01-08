package com.example.visprogalp_granautismo.main_feed_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar


import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.synac.instagramuipractice.main_feed_screen.PostWidget
import com.synac.instagramuipractice.model.User


@Composable
fun BottomBar() {
    BottomAppBar(
        modifier = Modifier
            .shadow(elevation = 4.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
            .blur(radius = 1.dp)
            .background(color = LightPinkBG)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_home_filled),
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color(0xFFF7D2D6)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.search2),
                    contentDescription = "Search Icon",
                    modifier = Modifier.size(35.dp),
                    tint = Color(0xFFF7D2D6)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.create),
                    contentDescription = "Add Icon",
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape)
                        .background(LightPinkBG),
                    tint = Color(0xFFF8F5F5),
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.notifications),
                    contentDescription = "Notifications",
                    modifier = Modifier.size(35.dp),
                    tint = Color(0xFFF7D2D6)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Image(
                    painter = painterResource(R.drawable.pp2),
                    contentDescription = "Profile Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                )
            }
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BottomBarPrev() {
    BottomBar()
}