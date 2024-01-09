package com.example.visprogalp_granautismo.ui.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.view.screens.Explore


@Composable
fun BottomBar(navHostController: NavHostController) {
    BottomAppBar(
        modifier = Modifier
            .shadow(
                elevation = 4.dp,
                spotColor = Color(0x40000000),
                ambientColor = Color(0x40000000)
            )
            .blur(radius = 1.dp)
            .background(color = LightPinkBG)
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {navHostController.navigate("Main")},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_home_filled),
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(35.dp)

                    ,
                    tint = Color(0xFFF7D2D6)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navHostController.navigate("Explore") },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.search2),
                    contentDescription = "Search Icon",
                    modifier = Modifier
                        .size(35.dp)

                    ,
                    tint = Color(0xFFF7D2D6)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {navHostController.navigate("Explore") },
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
            onClick = {navHostController.navigate("Explore") },
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
            onClick = {navHostController.navigate(Explore) },
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
    BottomBar(navHostController = rememberNavController())
}