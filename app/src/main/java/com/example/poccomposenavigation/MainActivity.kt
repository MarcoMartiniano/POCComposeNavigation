package com.example.poccomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigation.graph.AppNavigation
import com.example.poccomposenavigation.ui.theme.POCComposeNavigationTheme

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POCComposeNavigationTheme {
                val mainNavHostController: NavHostController = rememberNavController()
                val tabNavHostController: NavHostController = rememberNavController()
                viewModel.initNavigation(navHostController = mainNavHostController)
                AppNavigation(
                    mainNavHostController = mainNavHostController,
                    tabNavHostController = tabNavHostController
                )
            }
        }
    }
}