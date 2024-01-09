package com.example.visprogalp_granautismo.ui.view.screens

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightPurple
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.example.visprogalp_granautismo.model.User
import com.example.visprogalp_granautismo.ui.view.recipe_section.ralewayBold
import com.example.visprogalp_granautismo.ui.view.recipe_section.ralewayRegular

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
                        fontFamily = ralewayBold,
                        color = Purple,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(start = 8.dp),
                        style = TextStyle(fontWeight = FontWeight(800))
                    )
                    Text(
                        text = user.location,
                        fontFamily = ralewayRegular,
                        color = Purple,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(start = 8.dp, top = 6.dp),
                        style = TextStyle(fontWeight = FontWeight(400))
                    )
                }
            }
            Row{
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_save),
                        contentDescription = "Like Icon",
                        tint = LightPurple,
                        modifier = Modifier.size(25.dp)
                    )
                }
                IconButton(onClick = { /* TODO */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_more),
                        contentDescription = "More Options",
                        tint = LightPurple,
                        modifier = Modifier.rotate(90f) // Rotate only the Icon by 90 degrees
                    )
                }
            }

        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp) // Adjust the padding as needed
                .clip(RoundedCornerShape(20.dp)), // Adjust the corner radius as needed
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
                            tint = LightPurple,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                Text(
                    text = user.likeCount.toString(),
                    color = LightPurple,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 4.dp)
                )
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_comment),
                            contentDescription = "Like Icon",
                            tint = LightPurple,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                Text(
                    text = user.commentCount.toString(),
                    color = LightPurple,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_share),
                    contentDescription = "Like Icon",
                    tint = LightPurple,
                    modifier = Modifier.size(21.dp)
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
            profilePic = painterResource(R.drawable.user1),
            username = "Cranberry Pie",
            location = "Jakarta, Indonesia",
            postPic = painterResource(R.drawable.post1),
            likeCount = 168,
            caption = "Afternoon Tea with some Lovely Muffin. Comment if you want to know more about the other dessert recipe. I can also give you the full courses about baking.",
            commentCount = 15,
            commentTime = "1h ago"
        )
    )
}