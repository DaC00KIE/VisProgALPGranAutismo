package com.synac.instagramuipractice.comment_section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.synac.instagramuipractice.model.User
import com.synac.instagramuipractice.recipe_section.ralewayBold
import com.synac.instagramuipractice.recipe_section.ralewayRegular

@Composable
fun UserComment(user: User) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
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
            Row {
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
                    text = user.commentTime,
                    color = Purple,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Text(
                text = user.caption,
                fontFamily = ralewayRegular,
                color = Purple,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(start = 8.dp, top = 4.dp), // Adjusted top padding
                style = TextStyle(fontWeight = FontWeight(400))
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun UserCommentPreview() {
    Column {
        TopBarComment()

        CommentSection(user = User(
            profilePic = painterResource(R.drawable.user1),
            username = "Cranberry Pie",
            location = "Jakarta, Indonesia",
            postPic = painterResource(R.drawable.post1),
            likeCount = 168,
            caption = "Afternoon Tea with some Lovely Muffin. Comment if you want to know more about the other dessert recipe. I can also give you the full courses about baking.",
            commentCount = 15,
            commentTime = "1h ago"
        ))

    val user1 = User(
        profilePic = painterResource(R.drawable.choco),
        username = "Choco",
        location = "Jakarta, Indonesia",
        postPic = painterResource(R.drawable.post1),
        likeCount = 168,
        caption = "I really like the set. It looks so unique",
        commentCount = 15,
        commentTime = "1h ago"
    )

    val user2 = User(
        profilePic = painterResource(R.drawable.fregg),
        username = "Fregg",
        location = "Bandung",
        postPic = painterResource(R.drawable.post1),
        likeCount = 200,
        caption = "Wowww! what a perfect combo. Looks so yummy can you share the whole recipe?",
        commentCount = 20,
        commentTime = "2h ago"
    )

    val user3 = User(
        profilePic = painterResource(R.drawable.takoyaki),
        username = "Takoyaki",
        location = "Bandung",
        postPic = painterResource(R.drawable.post1),
        likeCount = 200,
        caption = "Wowww! what a perfect combo. Looks so yummy can you share the whole recipe?",
        commentCount = 20,
        commentTime = "3h ago"
    )

    val user4 = User(
        profilePic = painterResource(R.drawable.mrbeef),
        username = "Mr Beef",
        location = "Bandung",
        postPic = painterResource(R.drawable.post1),
        likeCount = 200,
        caption = "What a perfect afternoon tea, would be perfect combo with a great dinner! check my profile for some recipes about gyudon.",
        commentCount = 20,
        commentTime = "30m ago"
    )

    LazyColumn {
        items(listOf(user1, user2, user3, user4)) { user ->
            UserComment(user = user)
        }
      }
        WriteComment()
    }
}
