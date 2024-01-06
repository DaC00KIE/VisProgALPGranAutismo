package com.example.visprogalp_granautismo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.components.IconComponentDrawable
import com.example.visprogalp_granautismo.components.SpacerHeight
import com.example.visprogalp_granautismo.components.SpacerWidth
import com.example.visprogalp_granautismo.data.personList
import com.example.visprogalp_granautismo.navigation.Chat
import com.example.visprogalp_granautismo.navigation.Notification
import com.example.visprogalp_granautismo.ui.theme.ChatPurpleNigg
import com.example.visprogalp_granautismo.ui.theme.LightGrayFont
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.example.visprogalp_granautismo.ui.theme.Purple500
import com.example.visprogalp_granautismo.ui.theme.Purple700

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightPinkBG)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp)
        ) {
            Header()
                LazyColumn(modifier = Modifier.padding(top = 10.dp, bottom = 15.dp)) {
                    items(personList, key = { it.id }) {
                        UserEachRow(person = it) {
                            navHostController.currentBackStackEntry?.savedStateHandle?.set(
                                "data",
                                it
                            )
                            navHostController.navigate(Chat)
                        }
                    }
                }

        }
    }

}

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(LightPinkBG)
            .padding(vertical = 1.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(28.dp) // Adjust the size of the header box as needed
                .background(LightPinkBG)

        ) {
            Image(
                painter = painterResource(id = R.drawable.screenshot_2024_01_03_at_00_34_43_removebg_preview),
                contentDescription = null, // Add content description as needed
                modifier = Modifier
                    .fillMaxWidth()
                    .size(100.dp) // Adjust the original size of the image as needed
                    .scale(6.3f)
                    .align(Alignment.Center)


            )
        }
    }
}


@Composable
fun UserEachRow(
    modifier: Modifier = Modifier,
    person: com.example.visprogalp_granautismo.data.Person,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .clickable { onClick() }
            .padding(horizontal = 20.dp, vertical = 10.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(

                ) {
                    IconComponentDrawable(icon = person.icon, size = 60.dp , modifier = Modifier.clip(RoundedCornerShape(50)))
                    SpacerWidth()
                    Column {
                        Text(modifier = Modifier.padding(horizontal = 5.dp),
                            text = person.name,
                            style = TextStyle(
                                color = ChatPurpleNigg,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        )
                        SpacerHeight(5.dp)
                        Text(
                            stringResource(R.string.okay), style = TextStyle(
                                color = ChatPurpleNigg,
                                fontSize = 14.sp,
                            ),modifier = Modifier.padding(horizontal = 5.dp),
                        )
                    }
                }
                Text(
                    stringResource(R.string._12_23_pm), style = TextStyle(
                        color = Gray,
                        fontSize = 12.sp
                    )
                )
            }
            SpacerHeight(15.dp)
            Divider(modifier = Modifier.fillMaxWidth(), thickness = 1.dp)
        }
    }

}
@Preview(showBackground = true)
@Composable
fun preview() {
    val navHostController = rememberNavController() // Assuming you are using Navigation component
    HomeScreen(navHostController = navHostController)
}
