package com.example.visprogalp_granautismo.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.visprogalp_granautismo.screens.ChatScreen
import com.example.visprogalp_granautismo.screens.HomeScreen
import com.example.visprogalp_granautismo.screens.StartScreen
import com.synac.instagramuipractice.main_feed_screen.Explore
import com.synac.instagramuipractice.main_feed_screen.MainFeedScreen


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
const val Main = "MainFeedScreen"
const val Explore = "Explore"