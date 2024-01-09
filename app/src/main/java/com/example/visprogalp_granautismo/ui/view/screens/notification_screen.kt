//package com.example.visprogalp_granautismo.ui.view.screens
//
//import android.app.Notification
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Divider
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Color.Companion.Gray
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.SpanStyle
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.buildAnnotatedString
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.withStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.visprogalp_granautismo.R
//import com.example.visprogalp_granautismo.components.IconComponentDrawable
//import com.example.visprogalp_granautismo.components.SpacerHeight
//import com.example.visprogalp_granautismo.components.SpacerWidth
//
//import com.example.visprogalp_granautismo.data.Person
//
//import com.example.visprogalp_granautismo.data.personList
//
//import com.example.visprogalp_granautismo.ui.theme.ChatPurpleNigg
//
//@Composable
//fun NotificationScreen(
//    navHostController: NavHostController
//) {
//
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//    ) {
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(top = 30.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.White)
//                    .clip(
//                        RoundedCornerShape(
//                            topStart = 30.dp, topEnd = 30.dp
//                        )
//                    )
//                    .background(Color.White)
//            ) {
//
//                LazyColumn(modifier = Modifier.padding(top = 30.dp, bottom = 15.dp)) {
//                    items(notification_list, key = { it.id }) { notification ->
//                        NotificationEachRow(notification = notification) {
//                            navHostController.currentBackStackEntry?.savedStateHandle?.set(
//                                "data",
//                                notification
//                            )
//                        }
//                        Divider(color = Color.Gray, thickness = 0.5.dp)
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun NotificationEachRow(
//    modifier: Modifier = Modifier,
//    notification: Notification,
//    person: Person = personList.firstOrNull { it.id == notification.id } ?: Person(),
//    onClick: () -> Unit
//) {
//    Box(
//        modifier = modifier
//            .fillMaxWidth()
//            .background(Color.White)
//            .clickable { onClick() }
//            .padding(horizontal = 20.dp, vertical = 15.dp)
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                IconComponentDrawable(icon = person.icon, size = 60.dp, modifier = Modifier.clip(RoundedCornerShape(50)))
//                SpacerWidth() // Ensure SpacerWidth is consistent
//
//                Column {
//                    Text(
//                        text = buildAnnotatedString {
//                            withStyle(
//                                style = SpanStyle(
//                                    color = ChatPurpleNigg,
//                                    fontSize = 16.sp,
//                                    fontWeight = FontWeight.Bold
//                                )
//                            ) {
//                                append(person.name)
//                            }
//                            append(" ")
//                            append(
//                                buildAnnotatedString {
//                                    withStyle(
//                                        style = SpanStyle(
//                                            color = ChatPurpleNigg,
//                                            fontSize = 16.sp,
//                                        )
//                                    ) {
//                                        append(notification.message)
//                                    }
//                                }
//                            )
//                        },
//                        modifier = Modifier.padding(horizontal = 5.dp)
//                    )
//
//                    if (!notification.like && !notification.follow) {
//                        Text(
//                            text = notification.time,
//                            style = TextStyle(
//                                color = ChatPurpleNigg,
//                                fontSize = 14.sp,
//                            ),
//                            modifier = Modifier.padding(horizontal = 5.dp)
//                        )
//                    }
//                }
//
//            }
//
//            // Check for both follow and like to set the correct icon
//            if (notification.follow) {
//                IconComponentDrawable(icon = R.drawable.icons8_follow_24, size = 30.dp)
//            } else if (notification.like) {
//                IconComponentDrawable(icon = R.drawable.ic_like_outline, size = 30.dp)
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun previewnotif() {
//    val navHostController = rememberNavController() // Assuming you are using Navigation component
//    NotificationScreen(navHostController = navHostController)
//}