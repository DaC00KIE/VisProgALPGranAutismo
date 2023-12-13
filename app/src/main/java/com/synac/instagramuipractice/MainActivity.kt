package com.synac.instagramuipractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.visprogalp_granautismo.ui.theme.VisProgALPGranAutismoTheme
import com.synac.instagramuipractice.main_feed_screen.MainFeedScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProgALPGranAutismoTheme {
                MainFeedScreen()
            }
        }
    }
}
