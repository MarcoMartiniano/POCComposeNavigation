package com.example.poccomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigation.graph.AppNavigation
import com.example.poccomposenavigation.ui.theme.POCComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POCComposeNavigationTheme {
                val mainNavHostController: NavHostController = rememberNavController()
                val tabNavHostController: NavHostController = rememberNavController()
                AppNavigation(
                    mainNavHostController = mainNavHostController,
                    tabNavHostController = tabNavHostController
                )
            }
        }
    }
}