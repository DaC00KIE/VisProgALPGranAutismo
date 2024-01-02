package com.example.visprogalp_granautismo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.components.ButtonComponent
import com.example.visprogalp_granautismo.navigation.Home

@Composable
fun StartScreen(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Image(
            painter = painterResource(id = R.drawable.daenerys_targaryen), contentDescription = "",
            contentScale = ContentScale.FillWidth
        )

        Column (
            modifier = Modifier.fillMaxWidth()
                .padding(220.dp)
                .align(Alignment.Center)
        ){


        }
        ButtonComponent(
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.BottomCenter)
        ) {
            navHostController.navigate(Home)
        }

    }
}