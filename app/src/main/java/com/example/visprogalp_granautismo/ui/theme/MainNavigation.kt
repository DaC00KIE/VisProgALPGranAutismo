package com.example.visprogalp_granautismo.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.visprogalp_granautismo.ui.view.screens.MainFeedScreen
import com.example.visprogalp_granautismo.ui.view.screens.Explore
import com.example.visprogalp_granautismo.ui.view.screens.ChatScreen
import com.example.visprogalp_granautismo.ui.view.screens.HomeScreen
import com.example.visprogalp_granautismo.ui.view.screens.StartScreen

@Composable


fun MainNavigation(navHostController: NavHostController) {


    NavHost(navController = navHostController, startDestination = Main) {
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
            ChatScreen(
                navHostController
            )
        }
        composable(route = Main){
            MainFeedScreen(

            )
        }
        composable(Explore){
            Explore(
                navHostController
            )
        }
    }
}

const val Start = "start_screen"
const val Home = "home_screen"
const val Chat = "chat_screen"
const val Main = "main_feed_screen"
const val Explore = "explore"