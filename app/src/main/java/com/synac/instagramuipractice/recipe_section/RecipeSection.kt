package com.synac.instagramuipractice.recipe_section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.main_feed_screen.BottomBar
import com.example.visprogalp_granautismo.ui.theme.LightPurple
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.synac.instagramuipractice.model.User


val ralewayRegular = FontFamily(
    Font(R.font.raleway_regular)
)
val ralewayBold = FontFamily(
    Font(R.font.raleway_bold)
)
val ralewaySemibold = FontFamily(
    Font(R.font.raleway_semibold)
)
val ralewayThin = FontFamily(
    Font(R.font.raleway_thin)
)
@Composable
fun RecipeSection(
    user: User
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 12.dp, end = 12.dp),
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
            Row {
                // IconButton for Save Icon
                IconButton(onClick = { /* TODO */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_save),
                        contentDescription = "Save Icon",
                        tint = LightPurple,
                        modifier = Modifier.size(25.dp)
                    )
                }
                IconButton(onClick = { /* TODO */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_more),
                        tint = LightPurple,
                        contentDescription = "More Options",
                        modifier = Modifier.rotate(90f)
                    )
                }
            }
        }

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp)
                .clip(RoundedCornerShape(20.dp)),
            painter = user.postPic,
            contentDescription = "Post Picture",
            contentScale = ContentScale.FillWidth
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .size(4.dp)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.slide),
            contentDescription = "Slides",
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
                Row(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { /* TODO: Handle like button click */ }) {
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

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(end = 16.dp) // Adjust the padding as needed
                ) {
                    IconButton(onClick = { /*TODO: Handle comment button click */ }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_comment),
                            contentDescription = "Comment Icon",
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
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_share),
                    contentDescription = "Share Icon",
                    tint = Purple,
                    modifier = Modifier.size(21.dp)
                )
            }
        }
        Row (
            modifier = Modifier
                .padding(start = 25.dp, end = 25.dp)
        ){
            Text(
                text = user.username,
                color = Purple,
                fontSize = 14.sp,
                fontFamily = ralewayBold,
                modifier = Modifier.padding(start = 7.dp, top = 4.dp)
            )
                Text(
                    text = user.caption,
                    style = TextStyle(
                        fontWeight = FontWeight(800)),
                    color = Purple,
                    fontSize = 12.sp,
                    fontFamily = ralewayRegular,
                    modifier = Modifier.padding(start = 14.dp, top = 4.dp)
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeSectionPreview() {
    RecipeSection( user = User(
        profilePic = painterResource(R.drawable.user1),
        username = "Cranberry Pie",
        location = "Jakarta, Indonesia",
        postPic = painterResource(R.drawable.post1),
        likeCount = 168,
        caption = "Afternoon Tea with some Lovely Muffin. Comment if you want to know more about the other dessert recipe. I can also give you the full courses about baking.",
        commentCount = 15,
        commentTime = "1h ago"
    ))
}