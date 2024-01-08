package com.synac.instagramuipractice.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.synac.instagramuipractice.profile.EditProfile
import com.synac.instagramuipractice.profile.TopBarEditProfile

@Composable
fun NavBar() {
Column (
    modifier = Modifier
        .shadow(elevation = 4.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
        .blur(radius = 1.dp)
        .padding(1.dp)
        .fillMaxWidth()
        .height(81.dp)
        .background(color = Color(0xF2FFFFFF))
){
    Row (
        modifier = Modifier
            .padding(top = 20.dp, start = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        IconButton(onClick = {
            // Handle back button click here
        }) {
        Icon(
            painter = painterResource(id = R.drawable.homee),
            contentDescription = "home",
            tint = Color(0xFFF7D2D6),
            modifier = Modifier
                .size(30.dp)
        )
    }
        IconButton(onClick = {
            // Handle back button click here
        }) {
            Icon(
                painter = painterResource(id = R.drawable.search2),
                contentDescription = "search",
                tint = Color(0xFFF7D2D6),
                modifier = Modifier
                    .size(30.dp)
            )
        }
        IconButton(onClick = {
            // Handle back button click here
        },
            modifier = Modifier
                .clip(CircleShape)
                .background(LightPinkBG)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.create),
                contentDescription = "add post",
                tint = Color(0xFFF8F5F5),
                modifier = Modifier
                    .size(20.dp)

            )
        }
        IconButton(onClick = {
            // Handle back button click here
        }) {
        Icon(
            painter = painterResource(id = R.drawable.notifications),
            contentDescription = "notifications",
            tint = Color(0xFFF7D2D6),
            modifier = Modifier
                .size(30.dp)
        )
        }
            Image(
                painter = painterResource(id = R.drawable.pp2),
                contentDescription = "profile",
                modifier = Modifier
                    .size(40.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavBarPreview() {
    NavBar()
}