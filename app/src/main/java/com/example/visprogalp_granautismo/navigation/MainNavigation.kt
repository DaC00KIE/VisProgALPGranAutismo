package com.example.visprogalp_granautismo.navigation

import android.app.Notification
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.visprogalp_granautismo.screens.ChatScreen
import com.example.visprogalp_granautismo.screens.HomeScreen
import com.example.visprogalp_granautismo.screens.NotificationScreen
import com.example.visprogalp_granautismo.screens.StartScreen

@Composable
fun MainNavigation() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Start) {
        composable(Start){
            StartScreen(
                navHostController
            )
        }
        composable(Home){
            HomeScreen(
                navHostController
            )
        }
        composable(Chat){
            ChatScreen(navHostController)
        }
        composable(Notification) {
            NotificationScreen(navHostController)
            }
        }
    }


const val Start = "start_screen"
const val Home = "home_screen"
const val Chat = "chat_screen"
const val Notification = "notification_screen"