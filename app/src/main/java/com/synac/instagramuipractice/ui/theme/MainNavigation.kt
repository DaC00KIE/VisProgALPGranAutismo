package com.synac.instagramuipractice.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.synac.instagramuipractice.main_feed_screen.Explore
import com.synac.instagramuipractice.main_feed_screen.MainFeedScreen

@Composable
fun MainNavigation(

){
val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Home){
        composable(Home){
            MainFeedScreen()
        }
        composable(Explore){
            Explore(navHostController)
        }
    }
}
const val Home = "MainFeedScreen"
const val Explore = "Explore"
