package com.synac.instagramuipractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.navigation.ui.NavigationUI
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.visprogalp_granautismo.navigation.MainNavigation
import com.example.visprogalp_granautismo.ui.theme.VisProgALPGranAutismoTheme
import com.synac.instagramuipractice.main_feed_screen.MainFeedScreen


class MainActivity : ComponentActivity() {
    lateinit var navHostController: NavHostController

    @SuppressLint("SuspiciousIndentation")

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContent {

            VisProgALPGranAutismoTheme {

                navHostController = rememberNavController()

                    MainNavigation(navHostController)


            }
        }
    }
}
