package com.synac.instagramuipractice.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.example.visprogalp_granautismo.ui.theme.LightPurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarFollowing() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp, top = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(70.dp)
            ) {
                IconButton(onClick = {
                    // Handle back button click here
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                        tint = LightPurple,
                        contentDescription = "Back Button",
                        modifier = Modifier
                            .size(25.dp)
                            .padding(top = 5.dp)
                    )
                }
                Text(
                    text = "Cranberry Pie",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 27.24.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(800),
                        color = Color(0xFF65598E),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
            }
        }
    )
}

@Composable
fun Following() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "1452 Following",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.raleway_regular)),
                fontWeight = FontWeight(600),
                color = Color(0xFF65598E),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .padding(start = 150.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Divider(
            color = Color(0xFF9C9C9C),
            thickness = 0.2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, end = 35.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Sorted by Default",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 15.57.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF65598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 25.dp, top = 17.dp)
            )
            IconButton(
                onClick = {
                    // Handle button click here
                },

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.sort),
                    tint = LightPurple,
                    contentDescription = "Sort Button",
                    modifier = Modifier
                        .size(25.dp)
                        .padding(end = 5.dp)
                )
            }
        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
        ) {
            items(10) { index ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pp3),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Maverick Cakery", // Use index or any unique identifier
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 15.57.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF65598E),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Button(
                        onClick = { /* Handle button click here */ },
                        modifier = Modifier
                            .width(130.dp)
                            .height(35.dp)
                            .background(
                                color = Color.Transparent,
                                shape = RoundedCornerShape(size = 20.dp)
                            )
                    ) {
                        Text(
                            text = "Follow",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontFamily = FontFamily(Font(R.font.raleway_bold)),
                                fontWeight = FontWeight(800),
                                color = Color.White,
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FollowingPreview() {
    TopBarFollowing()
    Following()
}