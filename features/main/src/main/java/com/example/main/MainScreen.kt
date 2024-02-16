package com.example.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import com.example.uikit.models.BottomNavItem
import com.example.uikit.theme.Black
import com.example.uikit.theme.RoundedCornerShape16top
import com.example.uikit.ui.QuizBottomNavigationBar
import com.example.poccomposenavigation.uikit.R


@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.background(
            color = Black,
            shape = RoundedCornerShape16top
        ),
        bottomBar = {
            QuizBottomNavigationBar(
                items = listOf(
                    BottomNavItem(
                        name = "Home",
                        route = MainNavigation.HomeScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_home)
                    ),
                    BottomNavItem(
                        name = "Quiz",
                        route = MainNavigation.QuizScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_quiz)
                    ),
                    BottomNavItem(
                        name = "Enciclopedia",
                        route = MainNavigation.EncyclopediaScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_encyclopedia)
                    ),
                    BottomNavItem(
                        name = "Favoritos",
                        route = MainNavigation.FavoritesScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_favorite)
                    ),
                ),
                navController = navController,
                onItemClick = {
                    navController.navigate(it.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = innerPadding)
            ) {
                MainNavigation(navController = navController)
            }
        }
    )
}