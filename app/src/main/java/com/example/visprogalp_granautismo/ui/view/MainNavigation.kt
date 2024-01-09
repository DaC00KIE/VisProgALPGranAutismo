//package com.example.visprogalp_granautismo.ui.view
//
//import android.os.Build
//import androidx.annotation.RequiresApi
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavController
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.visprogalp_granautismo.ui.view.screens.ChatScreen
//import com.example.visprogalp_granautismo.ui.view.screens.HomeScreen
//import com.example.visprogalp_granautismo.ui.view.screens.StartScreen
//import com.example.visprogalp_granautismo.ui.view.screens.MainFeedScreen
//import com.example.visprogalp_granautismo.ui.view.screens.Explore
//
//
//@Composable
//
//
//fun MainNavigation(navHostController: NavHostController) {
//
//
//    NavHost(navController = navHostController, startDestination = "Main") {
//        composable("Start"){
//            StartScreen(
//                navHostController
//            )
//        }
//        composable("Home"){
//            HomeScreen(
//                navHostController
//            )
//        }
//        composable("Chat"){
//            ChatScreen(
//                navHostController
//            )
//        }
//        composable("Main"){
//            MainFeedScreen(
//
//            )
//        }
//        composable("Explore"){
//            Explore(
//                navHostController
//            )
//        }
//    }
//}
//
