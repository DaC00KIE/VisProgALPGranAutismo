package com.synac.instagramuipractice.recipe_section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.ui.theme.Purple

@Composable
fun RecipeCategory(categoryIngredients: List<String>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        categoryIngredients.forEach { ingredient ->
            Box(
                modifier = Modifier
                    .padding(6.dp)
                    .background(color = Color(0x80F7D2D6), shape = RoundedCornerShape(20.dp))
            ) {
                Text(
                    text = ingredient,
                    fontFamily = ralewayBold,
                    color = Purple,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .wrapContentSize(Alignment.Center)
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(fontWeight = FontWeight(700))
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeCategoryPreview() {
    RecipeCategory(categoryIngredients = listOf("Egg", "Flour", "Raspberry", "Sugar"))
}
