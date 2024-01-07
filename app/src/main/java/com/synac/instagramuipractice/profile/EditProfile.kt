package com.synac.instagramuipractice.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
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
import com.example.visprogalp_granautismo.ui.theme.LightPurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarEditProfile() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp, top = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(70.dp)
            ) {
                IconButton(onClick = {
                    // Handle back button click here
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                        tint = LightPurple,
                        contentDescription = "Back Button",
                        modifier = Modifier
                            .size(25.dp)
                            .padding(top = 5.dp)
                    )
                }
                Text(
                    text = "Edit Profile",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 27.24.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(800),
                        color = Color(0xFF65598E),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .padding(top = 12.dp, start = 10.dp)
                )
            }
        }
    )
}

@Composable
fun EditProfile() {
    val scrollState = rememberScrollState()
Column (
    modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState())
       
) {
    Spacer(modifier = Modifier.height(80.dp))
    Box(
        modifier = Modifier
            .padding(start = 125.dp)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.pp2),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(145.dp)
                .height(145.dp)
                .clip(CircleShape)
        )
    }
    Box(
        modifier = Modifier
            .padding(start = 120.dp)
    ){
        Text(
            text = "Change Profile",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 27.24.sp,
                fontFamily = FontFamily(Font(R.font.raleway_bold)),
                fontWeight = FontWeight(800),
                color = Color(0xFF65598E),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .padding(top = 25.dp, start = 5.dp)
        )
    }
    Column (
           modifier = Modifier
               .fillMaxWidth()
               .padding(top = 25.dp, start = 35.dp)
       ){
           Text(
               text = "Username",
               style = TextStyle(
                   fontSize = 16.sp,
                   fontFamily = FontFamily(Font(R.font.raleway_bold)),
                   fontWeight = FontWeight(500),
                   color = Color(0xFF9C9C9C),
                   textAlign = TextAlign.Center,
               ),
               modifier = Modifier
                   .padding(bottom = 15.dp, start = 10.dp)
           )
           Row (
               horizontalArrangement = Arrangement.spacedBy(20.dp)
           ){
               Image(
                   painter = painterResource(id = R.drawable.people),
                   contentDescription = "people",
                   contentScale = ContentScale.Fit,
                   modifier = Modifier
                       .size(25.dp)
               )
               Text(
                   text = "Enter your username",
                   style = TextStyle(
                       fontSize = 14.sp,
                       fontFamily = FontFamily(Font(R.font.raleway_bold)),
                       fontWeight = FontWeight(500),
                       color = Color(0xFF9C9C9C),
                       textAlign = TextAlign.Center,
                   )
               )
           }
       }
       Spacer(modifier = Modifier.height(20.dp))
       Divider(
           color = Color(0xFF9C9C9C),
           thickness = 0.2.dp,
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 35.dp, end = 35.dp)
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
               .padding(top = 20.dp, start = 45.dp)
       )
       Column (
           modifier = Modifier
               .fillMaxWidth()
               .padding(top = 20.dp, start = 40.dp)
       ) {
           Row(
               horizontalArrangement = Arrangement.spacedBy(20.dp)
           ) {
               Image(
                   painter = painterResource(id = R.drawable.email),
                   contentDescription = "email",
                   contentScale = ContentScale.Fit,
                   modifier = Modifier
                       .size(20.dp)
               )
               Text(
                   text = "Enter your username",
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
                   .padding(start = 35.dp, end = 35.dp)
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
           Row(
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
               ) {
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
           Spacer(modifier = Modifier.height(20.dp))
           Text(
               text = "Bio",
               style = TextStyle(
                   fontSize = 16.sp,
                   fontFamily = FontFamily(Font(R.font.raleway_bold)),
                   fontWeight = FontWeight(500),
                   color = Color(0xFF9C9C9C),
                   textAlign = TextAlign.Center,
               )
           )
       }
    Column (
        modifier = Modifier
            .padding(start = 25.dp, top = 15.dp)
            .width(340.dp)
            .height(175.dp)
            .background(color = Color(0x80F7D2D6), shape = RoundedCornerShape(size = 20.dp))

    ){
        Text(
            text = "Lorem ipsum bla bla sadasd vsadasdasdad nothsdas cxxc sdsdsdsada sdsdsdsdsdsd ccxcxc ddfdsfsdfc",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 12.65.sp,
                fontFamily = FontFamily(Font(R.font.raleway_regular)),
                fontWeight = FontWeight(800),
                color = Color(0xFF65598E),
            ),
            modifier = Modifier
                .padding(25.dp))
    }
    Button(
        onClick = { /* Handle button click here */ },
        modifier = Modifier
            .padding(top = 30.dp, start = 70.dp, end = 70.dp, bottom = 30.dp)
            .fillMaxWidth()
            .height(50.dp)
            .background(
                color = Color(0xFFFFB6C1),
                shape = RoundedCornerShape(size = 35.dp)
            )
    ) {
        Text(
            text = "Save Changes",
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
fun EditProfilePreview() {
    TopBarEditProfile()
    EditProfile()
}