package com.example.visprogalp_granautismo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
//import com.example.visprogalp_granautismo.ui.view.MainNavigation
import com.example.visprogalp_granautismo.ui.view.Route

class MainActivity : ComponentActivity() {
    lateinit var navHostController: NavHostController



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContent {



                navHostController = rememberNavController()
//                MainNavigation(navHostController)
            Route()

            }

    }
}
