package com.example.visprogalp_granautismo.ui.view.create_post

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
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
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.example.visprogalp_granautismo.ui.view.recipe_section.RecipeCategory
import com.example.visprogalp_granautismo.ui.view.recipe_section.ralewayBold

@Composable
fun PostFeature() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.user1),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(60.dp)
                        .height(55.dp)
                        .padding(start = 10.dp)
                )
                Spacer(modifier = Modifier.width(16.dp)) // Adjust the spacing as needed
                Text(
                    text = "Write your caption...",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 13.62.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFF9C9C9C),
                        textAlign = TextAlign.Center,
                    )
                )
            }
            Image(
                painter = painterResource(id = R.drawable.post),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(70.dp)
                    .height(60.dp)
                    .padding(end = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        RecipeCategory(categoryIngredients = listOf("Egg", "Flour", "Raspberry", "Sugar"))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 35.dp, top = 20.dp, end = 35.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(Color(0x80F7D2D6))
        ) {
            Text(
                text = "Lovely Muffin",
                fontFamily = ralewayBold,
                color = Purple,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = TextStyle(fontWeight = FontWeight(800))
            )
            Text(
                text = "Ingredients",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 11.68.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Purple,
                    textAlign = TextAlign.Justify,
                ),
                modifier = Modifier.padding(end = 30.dp, start = 30.dp, top = 30.dp, bottom = 10.dp)
            )
            Text(
                text = "2 cups all-purpose flour\n3 teaspoons baking powder\n¾ cup white sugar\n¾ cup white cream\n½ teaspoon salt\n1 egg\n1 cup milk\n1 Raspberry per Muffin",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 11.68.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_regular)),
                    fontWeight = FontWeight(800),
                    color = Purple,
                    textAlign = TextAlign.Justify,
                ),
                modifier = Modifier.padding(end = 30.dp, start = 30.dp, bottom = 10.dp)
            )
            Text(
                text = "Steps",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 11.68.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Purple,
                    textAlign = TextAlign.Justify,
                ),
                modifier = Modifier.padding(end = 30.dp, start = 30.dp, top = 10.dp, bottom = 10.dp)
            )
            Text(
                text = "1. Preheat the oven to 400 degrees F (200 degrees C). Grease a 12-cup muffin tin or line cups with paper liners.\n2. Stir flour, baking powder, salt, and sugar together in a large bowl; make a well in the center.\n3. Beat egg with a fork in a small bowl or 2-cup measuring cup; whisk in milk and oil. Pour egg mixture all at once into flour mixture; mix quickly and lightly with a fork until just moistened. The batter will be lumpy. (Fold in additional ingredients if using; see variations below). Spoon batter into the prepared muffin cups, filling each 3/4 full.\n4. Bake in the preheated oven until tops spring back when lightly pressed, about 25 minutes.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 11.68.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_regular)),
                    fontWeight = FontWeight(800),
                    color = Purple,
                    textAlign = TextAlign.Justify,
                ),
                modifier = Modifier.padding(end = 30.dp, start = 30.dp, bottom = 30.dp)
            )
        }
        Button(
            onClick = { /* Handle button click here */ },
            modifier = Modifier
                .padding(top = 30.dp, start = 70.dp, end = 70.dp, bottom = 20.dp)
                .fillMaxWidth()
                .height(50.dp)
                .background(
                    color = Color(0xFFFFB6C1),
                    shape = RoundedCornerShape(size = 35.dp)
                )
        ) {
            Text(
                text = "Share Post",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(1000),
                    textAlign = TextAlign.Center,
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostFeaturePreview() {
    Column {
        TopBarPostFeature()
        PostFeature()

    }
}
