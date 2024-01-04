@file:OptIn(ExperimentalMaterial3Api::class)

package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text


import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {

    val instagramTitleFont = FontFamily(
        Font(R.font.instagram_logo_font)
    )

    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    modifier = Modifier.offset(y = 5.dp),
                    text = "",
                    fontFamily = instagramTitleFont,
                    fontSize = 35.sp,
                    color = Color.Black

                )
                Text(
                    modifier = Modifier.offset(y = 5.dp),
                    text = "Instayum",
                    fontFamily = instagramTitleFont,
                    fontSize = 35.sp,
                    color = Color.Black

                )
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_send),
                        contentDescription = "Send Message",
                        tint = Color.Black,
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
        },
        //colors = White,

        actions = {


        }
    )
}


@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}