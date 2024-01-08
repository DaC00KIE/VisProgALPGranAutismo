package com.synac.instagramuipractice.recipe_section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.main_feed_screen.BottomBar
import com.example.visprogalp_granautismo.ui.theme.DarkPinkBG
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.synac.instagramuipractice.model.User
@Composable
fun RecipeDetail(user: User) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .padding(35.dp, 10.dp, 35.dp, 35.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color(0x80F7D2D6))
    ) {
            Column {
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
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeDetailPreview() {
    val user = User(
        profilePic = painterResource(R.drawable.user1),
        username = "Cranberry Pie",
        location = "Jakarta, Indonesia",
        postPic = painterResource(R.drawable.post1),
        likeCount = 168,
        caption = "Afternoon Tea with some Lovely Muffin. Comment if you want to know more about the other dessert recipe. I can also give you the full courses about baking.",
        commentCount = 15,
        commentTime = "1h ago"
    )

    Column {
        TopBarRecipe()
        RecipeSection(user = user)
        RecipeCategory(categoryIngredients = listOf("Egg", "Flour", "Raspberry", "Sugar"))
        RecipeDetail(user = user)
        BottomBar(navHostController = rememberNavController())
    }
}
