
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.example.visprogalp_granautismo.ui.view.create_post.TopBarCreatePost
import com.example.visprogalp_granautismo.viewmodel.CreatePostViewModel


@Composable
fun CreatePostFeature(categoryMeasurement: CreatePostViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, top = 16.dp)
    ) {
        Text(
            text = "Add Recipe Title",
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 13.62.sp,
                fontFamily = FontFamily(Font(R.font.raleway_bold)),
                fontWeight = FontWeight(700),
                color = Color(0x8065598E),
                textAlign = TextAlign.Center,
            )
        )
        Spacer(modifier = Modifier.height(14.dp))
        Divider(
            color = Color(0xFF9C9C9C),
            thickness = 0.2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 35.dp)
        )
        Button(
            onClick = { /* Handle button click here */ },
            modifier = Modifier
                .padding(top = 20.dp, start = 100.dp, end = 100.dp, bottom = 20.dp)
                .fillMaxWidth() // Adjusted to fill the width
                .height(50.dp)
                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(size = 35.dp)
                )
        ) {
            Text(
                text = "Select Image",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    textAlign = TextAlign.Center,
                ),
            )
        }
        Spacer(modifier = Modifier.height(14.dp))
        Divider(
            color = Color(0xFF9C9C9C),
            thickness = 0.2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 35.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Add Ingredients",
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 13.62.sp,
                fontFamily = FontFamily(Font(R.font.raleway_bold)),
                fontWeight = FontWeight(700),
                color = Color(0x8065598E),
                textAlign = TextAlign.Center,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .padding(6.dp)
                .background(color = Color(0x80F7D2D6), shape = RoundedCornerShape(20.dp))
        ) {
            Row(
                modifier = Modifier
                    .width(50.dp)
                    .height(35.dp)
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "",
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                IconButton(
                    onClick = { /* Handle click here */ }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "add ingredient",
                        modifier = Modifier.size(28.dp),
                        tint = Color.White
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Divider(
            color = Color(0xFF9C9C9C),
            thickness = 0.2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 35.dp)
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ){
            Text(
                text = "Add Steps",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 13.62.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(700),
                    color = Color(0x8065598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier.padding(top = 10.dp)
            )
            Spacer(modifier = Modifier.height(14.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 15.dp, top = 10.dp, bottom = 10.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color(0x80F7D2D6))
            ) {
                Text(
                    text = "Steps",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 11.68.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(800),
                        color = Purple,
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier.padding(start = 15.dp, top = 10.dp)
                )
                Text(
                    text = "1. Preheat the oven to 400 degrees F (200 degrees C). \n2. Grease a 12-cup muffin tin or line cups with paper liners.\n",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 15.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_semibold)),
                        fontWeight = FontWeight(800),
                        color = Color(0xFF65598E),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier.padding(start = 15.dp, top = 10.dp)
                )
            }
        }
    }
    Surface ( modifier = Modifier
        .padding(top = 15.dp)
        .fillMaxWidth(),
        color = Color(0x80F7D2D6),
        shape = RoundedCornerShape(size = 20.dp),
        ) {
        Card(
            modifier = Modifier
                .height(280.dp)
                .padding(top = 15.dp)
                .background(color = Color.Transparent),
            shape = RoundedCornerShape(size = 40.dp),
        ) {
            Text(
                text = "Ingredient Name",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 13.62.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(700),
                    color = Color(0x8065598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(top = 20.dp, start = 20.dp)
                    .clickable { }
            )
            Spacer(modifier = Modifier.height(14.dp))
            Divider(
                color = Color(0xFF9C9C9C),
                thickness = 0.2.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 35.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = "Measurement",
                    style = TextStyle(
                        fontSize = 15.sp,
                        lineHeight = 13.62.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(700),
                        color = Color(0x8065598E),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                )

                Row(
                    modifier = Modifier
                        .padding(start = 150.dp, top = 10.dp)
                        .width(70.dp)
                        .height(25.dp)
                        .background(
                            color = Color(0xCCF7D2D6),
                            shape = RoundedCornerShape(size = 5.dp)
                        ),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(onClick = { /* TODO */ }) {
                            Icon(
                                painter = painterResource(R.drawable.baseline_remove_circle_24),
                                contentDescription = "Save Icon",
                                tint = Color.White,
                                modifier = Modifier.size(15.dp)
                            )
                        }
                    }

                    Text(
                        text = "1",
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(top = 4.dp)
                    )

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(onClick = { /* TODO */ }) {
                            Icon(
                                painter = painterResource(R.drawable.baseline_add_circle_24),
                                contentDescription = "Save Icon",
                                tint = Color.White,
                                modifier = Modifier.size(15.dp)
                            )
                        }
                    }
                }
            }

//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp),
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//            ) {
//                categoryMeasurement.forEach { Measurement ->
//                    Box(
//                        modifier = Modifier
//                            .padding(6.dp)
//                            .background(
//                                color = Color(0x80F7D2D6),
//                                shape = RoundedCornerShape(20.dp)
//                            )
//                    ) {
//                        Text(
//                            text = Measurement,
//                            style = TextStyle(
//                                fontSize = 12.sp,
//                                fontFamily = FontFamily(Font(R.font.raleway_bold)),
//                                fontWeight = FontWeight(700),
//                                color = Color(0xFFFFFFFF),
//                                textAlign = TextAlign.Center,
//                            ),
//                            modifier = Modifier
//                                .padding(10.dp)
//                                .clickable { }
//                        )
//                    }
//                }
//            }
        }
        Button(
            onClick = { /* Handle button click here */ },
            modifier = Modifier
                .padding(top = 210.dp, start = 90.dp, end = 90.dp, bottom = 20.dp)
                .fillMaxWidth() // Adjusted to fill the width
                .height(50.dp)
                .background(
                    color = Color(0xFFFFB6C1), // Light Pink color
                    shape = RoundedCornerShape(size = 35.dp)
                )
        ) {
            Text(
                text = "Add",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    textAlign = TextAlign.Center,
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreatePostFeaturePreview() {
    Column {
        TopBarCreatePost()
//        CreatePostFeature(categoryMeasurement = listOf("Pcs", "Cup", "Teaspoon", "Glass"))
    }
}
