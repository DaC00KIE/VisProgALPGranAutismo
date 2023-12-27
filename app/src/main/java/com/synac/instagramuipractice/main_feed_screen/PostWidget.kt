package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.synac.instagramuipractice.model.User

@Composable
fun PostWidget(
    user: User
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape),
                    painter = user.profilePic,
                    contentDescription = "Profile Pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = user.username,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(
                        text = user.location,
                        fontSize = 14.sp
                    )
                }
            }
            Row{
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_save),
                        contentDescription = "Like Icon",
                        tint = Color.Black,
                        modifier = Modifier.size(25.dp)
                    )
                }
                IconButton(onClick = { /* TODO */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_more),
                        contentDescription = "More Options",
                        modifier = Modifier.rotate(90f) // Rotate only the Icon by 90 degrees
                    )
                }
            }

        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp) // Adjust the padding as needed
                .clip(RoundedCornerShape(16.dp)), // Adjust the corner radius as needed
            painter = user.postPic,
            contentDescription = "Post Picture",
            contentScale = ContentScale.FillWidth
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_like_outline),
                            contentDescription = "Like Icon",
                            tint = Color.Black,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_comment),
                            contentDescription = "Like Icon",
                            tint = Color.Black,
                            modifier = Modifier.size(30.dp)
                        )
                    }


            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_send),
                    contentDescription = "Like Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }

        }
//        Column(
//            modifier = Modifier.padding(horizontal = 10.dp)
//        ) {
//            Text(
//                text = "${user.likeCount} likes"
//            )
//            Text(
//                text = buildAnnotatedString {
//                    append(
//                        AnnotatedString(
//                            text = "${user.username}  ",
//                            spanStyle = SpanStyle(fontWeight = FontWeight.Bold)
//                        )
//                    )
//                    append(user.caption)
//                }
//            )
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(
//                text = "View all ${user.commentCount} comments",
//                color = Color.DarkGray,
//                fontSize = 13.sp
//            )
//        }
    }
}


@Preview(showBackground = true)
@Composable
fun PostWidgetPrev() {
    PostWidget(
        user = User(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "jon_snow",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.jon_snow_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        )
    )
}