package com.example.visprogalp_granautismo.ui.view.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.components.IconComponentDrawable
import com.example.visprogalp_granautismo.components.IconComponentImageVector
import com.example.visprogalp_granautismo.components.SpacerWidth
import com.example.visprogalp_granautismo.data.Chat
import com.example.visprogalp_granautismo.data.Person
import com.example.visprogalp_granautismo.data.chatList
import com.example.visprogalp_granautismo.ui.theme.ChatPurpleNigg
import com.example.visprogalp_granautismo.ui.theme.DarkLightPinkBG
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.theme.Purple

@Composable
fun ChatScreen(
    navHostController: NavHostController

) {
    var message by remember { mutableStateOf("") }
    val person =
        navHostController.previousBackStackEntry?.savedStateHandle?.get<Person>("data") ?: Person()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            UserEachRow(
                person = person,
                modifier = Modifier.padding(top = 30.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color.White, RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 30.dp
                        )
                    )
            ) {

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            start = 15.dp, end = 15.dp, top =5.dp, bottom = 75.dp
                        )
                ) {
                    items(chatList,key={it.id}) {
                        ChatRow(chat = it)
                    }
                }
                TextFieldComponent(
                    text = message, modifier = Modifier
                        .padding(20.dp)
                        .align(
                            Alignment.BottomCenter
                        )
                ) {
                    message = it
                }
            }
        }
    }

}

@Composable
fun ChatRow(
    chat: Chat
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = if (chat.direction) Alignment.Start else Alignment.End
    ) {

        Box(
            modifier = Modifier.background(
                if (chat.direction) Purple else LightPinkBG, RoundedCornerShape(11.dp)
            ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = chat.message, style = TextStyle(
                    fontSize = 15.sp,
                    color = Color.White
                ),
                textAlign = TextAlign.End,
                modifier = Modifier.padding(horizontal = 15.dp, vertical = 8.dp)
            )
        }
        Text(
            text = chat.time, style = TextStyle(
                fontSize = 12.sp,
                color = Color.Gray
            ),
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 8.dp)
        )
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent(
    modifier: Modifier = Modifier,
    text: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        value = text, onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Purple,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent
        ),
        placeholder = {
            Text(
                text = stringResource(R.string.type_message),
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Black,
                ),
                modifier = Modifier.padding(start = 8.dp) // Adjust the padding as needed
            )
        },
        leadingIcon = {
            IconButtonComponentImageVector(icon = Icons.Default.Add)
        },
        trailingIcon = {
            IconButtonComponentDrawable(icon = R.drawable.ic_send)
        }
    )
}

@Composable
fun IconButtonComponentImageVector(
    icon: ImageVector
) {
    Box(
        modifier = Modifier
            .background(DarkLightPinkBG, CircleShape)
            .size(33.dp),
        contentAlignment = Alignment.Center
    ) {
        IconComponentImageVector(icon = icon, size = 15.dp, tint = Color.Black)
    }
}

@Composable
fun IconButtonComponentDrawable(
    @DrawableRes icon: Int
) {
    Box(
        modifier = Modifier
            .background(DarkLightPinkBG, CircleShape)
            .size(33.dp),
        contentAlignment = Alignment.Center
    ) {
        IconComponentDrawable(icon = icon, size = 15.dp, tint = Color.Black)
    }
}

@Composable
fun UserEachRow(
    modifier: Modifier = Modifier,
    person: Person
) {

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row {
            IconComponentDrawable(icon = person.icon, size = 42.dp)
            SpacerWidth()
            Column() {
                Text(
                    text = person.name, style = TextStyle(
                        color = ChatPurpleNigg,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    stringResource(R.string.online), style = TextStyle(
                        color = ChatPurpleNigg,
                        fontSize = 14.sp,
                    )
                )
            }
        }

        IconComponentImageVector(icon = Icons.Default.MoreVert, size = 24.dp, tint = ChatPurpleNigg)

    }


}