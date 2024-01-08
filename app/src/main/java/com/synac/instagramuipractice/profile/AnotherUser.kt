package com.synac.instagramuipractice.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.main_feed_screen.BottomBar
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.theme.LightPurple
import com.example.visprogalp_granautismo.ui.theme.Purple

@Composable
fun AnotherUser() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bgprofile),
            contentDescription = "user pp",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
        )

        IconButton(
            onClick = {
                // Handle back button click here
            },
            modifier = Modifier
                .padding(top = 40.dp, start = 20.dp)
                .size(35.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.background)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                tint = LightPurple,
                contentDescription = "Back Button",
                modifier = Modifier
                    .size(30.dp)
                    .padding(start = 6.dp)
            )
        }

        IconButton(
            onClick = {
                // Handle message button click here
            },
            modifier = Modifier
                .padding(top = 42.dp, end = 20.dp)
                .size(30.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.background)
                .align(Alignment.TopEnd)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.msg),
                tint = Purple,
                contentDescription = "Message Button",
                modifier = Modifier
                    .size(25.dp)
            )
        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Spacer(modifier = Modifier.height(250.dp))
            Text(
                text = "40.5k",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 14.59.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFF65598E),
                ),
                modifier = Modifier
                    .padding(start = 30.dp, top = 15.dp)
            )
            Text(
                text = "Followers",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 11.68.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_regular)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFF65598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 25.dp, top = 5.dp)
                    .clickable { }
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(top = 10.dp)
        ) {
            Spacer(modifier = Modifier.height(200.dp))
            Image(
                painter = painterResource(id = R.drawable.pp),
                contentDescription = "profile pic",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Box (
                modifier = Modifier
                    .padding(start = 50.dp, top = 15.dp)
            ){
                Text(
                    text = "Maverick Cakery",
                    style = TextStyle(
                        fontSize = 15.sp,
                        lineHeight = 14.59.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(800),
                        color = Color(0xFF65598E),
                        textAlign = TextAlign.Center,
                    ),
                )
                Box (
                    modifier = Modifier
                        .padding(end = 40.dp, top = 30.dp)
                ){
                    Text(
                        text = "Maverick’s Cakery, finna show off this bakery ;)",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 12.65.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_regular)),
                            fontWeight = FontWeight(800),
                            color = Color(0xCC65598E),
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.65.sp,
                        ),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Spacer(modifier = Modifier.height(250.dp))
            Text(
                text = "326",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 14.59.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFF65598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 10.dp, top = 15.dp)
            )
            Text(
                text = "Following",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 11.68.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_regular)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFF65598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(end = 15.dp, top = 5.dp)
                    .clickable { }
            )
        }
    }
    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        Spacer(modifier = Modifier.height(450.dp))
        Row (
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ){
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .padding(start = 40.dp)
                    .width(130.dp)
                    .height(50.dp)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(size = 20.dp)
                    )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.follow),
                    contentDescription = "people user",
                    modifier = Modifier
                        .size(20.dp)
                    )
                    Text(
                        text = "Follow",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(800),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                        ),
                    modifier = Modifier
                             .padding(start = 10.dp)
                    )
            }
            Column {
                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .width(130.dp)
                        .height(50.dp)
                        .background(
                            color = Color.Transparent,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_mail_24),
                        contentDescription = "message",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(20.dp)

                    )
                    Text(
                        text = "Message",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(800),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                }
            }
        }
    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Spacer(modifier = Modifier.height(550.dp))
        Row(
            modifier = Modifier
                .padding(horizontal =20.dp),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ){
            Text(
                text = "All",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFF65598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 30.dp)
            )
            Text(
                text = "Most Popular",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFFB6B3BD),
                    textAlign = TextAlign.Center,
                )
            )
            Text(
                text = "Most Liked",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFFB6B3BD),
                    textAlign = TextAlign.Center,
                )
            )
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            items(10) { index ->
                when (index) {
                    0 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp1),
                            contentDescription = "Image 1",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    1 -> {
                        Image(
                            painter = painterResource(id = R.drawable.roll),
                            contentDescription = "Image 2",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    2 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp3),
                            contentDescription = "Image 3",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    3 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp4),
                            contentDescription = "Image 4",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    4 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp5),
                            contentDescription = "Image 5",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    5 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp6),
                            contentDescription = "Image 6",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    6 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp7),
                            contentDescription = "Image 7",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    7 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp8),
                            contentDescription = "Image 8",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    8 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp9),
                            contentDescription = "Image 9",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                    9 -> {
                        Image(
                            painter = painterResource(id = R.drawable.pp3),
                            contentDescription = "Image 10",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(115.dp)
                                .height(115.dp)
                                .padding(5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnotherUserPreview() {
        AnotherUser()
        BottomBar()
}
