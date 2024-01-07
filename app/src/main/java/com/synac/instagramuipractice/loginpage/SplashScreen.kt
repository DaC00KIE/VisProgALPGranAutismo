package com.synac.instagramuipractice.loginpage

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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

@Composable
fun SplashScreen() {
Column (
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
    horizontalAlignment = Alignment.CenterHorizontally
){
    Spacer(modifier = Modifier.height(320.dp))
    Image(
        painter = painterResource(id = R.drawable.logoinstayum1),
        contentDescription = "logo",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .shadow(elevation = 4.dp, spotColor = Color(0x1A000000), ambientColor = Color(0x1A000000))
            .width(120.dp)
            .height(120.dp)
    )
    Text(
        text = "Instayum",
        style = TextStyle(
            fontSize = 48.sp,
            fontFamily = FontFamily(Font(R.font.satisfy)),
            fontWeight = FontWeight(400),
            color = Color(0xFFF7D2D6),
            textAlign = TextAlign.Center,
        ),
        modifier = Modifier
            .padding(top = 10.dp)
    )
}
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}