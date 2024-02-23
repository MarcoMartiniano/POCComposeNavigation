package com.example.poccomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.poccomposenavigation.ui.theme.POCComposeNavigationTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigation.graph.AppNavigation
import com.example.navigation.graph.AppNavigation2

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POCComposeNavigationTheme {
                val navHostController: NavHostController = rememberNavController()
                viewModel.initNavigation(navHostController = navHostController)
                //AppNavigation(navController = navHostController)
                AppNavigation2(navController = navHostController)
            }
        }
    }
}