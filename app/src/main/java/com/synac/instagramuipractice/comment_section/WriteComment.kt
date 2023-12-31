package com.synac.instagramuipractice.comment_section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightGrayFont
import com.example.visprogalp_granautismo.ui.theme.LightPurple
import com.synac.instagramuipractice.recipe_section.ralewayBold

@Composable
fun WriteComment() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            ,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(10.dp)
                .background(color = Color(0xFF968BBD), shape = RoundedCornerShape(size = 10.dp)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Type a Comment",
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(start = 20.dp),
                style = TextStyle(
                    fontFamily = ralewayBold,
                    fontWeight = FontWeight.W800
                ),
            )
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.send),
                    contentDescription = "Send Icon",
                    modifier = Modifier
                        .size(85.dp)
                        .scale(1f)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WriteCommentPreview() {
    WriteComment()
}
