package com.example.visprogalp_granautismo.ui.view.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.theme.LightPurple

@Composable
fun SignIn() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(LightPinkBG),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Image(
            painter = painterResource(id = R.drawable.logoinstayum1),
            contentDescription = "logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x1A000000),
                    ambientColor = Color(0x1A000000)
                )
                .width(120.dp)
                .height(120.dp)
        )
        Text(
            text = "Instayum",
            style = TextStyle(
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.satisfy)),
                fontWeight = FontWeight(400),
                color = Color.White,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        Column(
            modifier = Modifier
                .width(430.dp)
                .height(500.dp)
                .background(
                    color = Color(0xFFFFFFFF), shape = RoundedCornerShape(
                        topStart = CornerSize(60.dp),
                        topEnd = CornerSize(60.dp),
                        bottomStart = CornerSize(0.dp),
                        bottomEnd = CornerSize(0.dp)
                    )
                )
        ) {
            Text(
                text = "Sign in",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF6A6675),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(top = 50.dp, start = 50.dp)
            )
            Text(
                text = "Email",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF9C9C9C),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(top = 40.dp, start = 50.dp)
            )
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp)
            ){
                Row (
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "email",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        text = "Enter your email",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF9C9C9C),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Divider(
                    color = Color(0xFF9C9C9C),
                    thickness = 0.2.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 25.dp, end = 35.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Password",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF9C9C9C),
                        textAlign = TextAlign.Center,
                    )
                )
                Row (
                    modifier = Modifier
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = "email",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        text = "Password",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF9C9C9C),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Box(
                        modifier = Modifier
                            .padding(start = 140.dp)
                    ){
                    Image(
                        painter = painterResource(id = R.drawable.eyepass),
                        contentDescription = "eye pass",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Divider(
                    color = Color(0xFF9C9C9C),
                    thickness = 0.2.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 25.dp, end = 35.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .padding(start = 25.dp)
                        .width(260.dp)
                        .height(55.dp)
                        .background(
                            color = Color.Transparent,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                ){
                    Text(
                        text = "Login",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(800),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                        )
                    )
                }
                Row (
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ){
                    Text(
                        text = "Don’t have an account yet?",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFD9A3B0),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp, start = 10.dp)
                    )
                    Text(
                        text = "Sign Up",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFD9A3B0),
                            textAlign = TextAlign.Center,
                            textDecoration = TextDecoration.Underline
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp, start = 10.dp)
                            .clickable {  }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInPreview() {
    SignIn()
}