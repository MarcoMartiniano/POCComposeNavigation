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
import androidx.navigation.NavHostController
import com.example.uikit.models.BottomNavItem
import com.example.uikit.theme.Black
import com.example.uikit.theme.RoundedCornerShape16top
import com.example.uikit.ui.QuizBottomNavigationBar
import com.example.poccomposenavigation.uikit.R


@Composable
fun MainScreen(
    mainNavHostController: NavHostController,
    tabNavHostController: NavHostController,
) {
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
                        route = MainNavigation.HomeScreen.HomeScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_home)
                    ),
                    BottomNavItem(
                        name = "Quiz",
                        route = MainNavigation.QuizScreen.QuizScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_quiz)
                    ),
                    BottomNavItem(
                        name = "Enciclopedia",
                        route = MainNavigation.EncyclopediaScreen.EncyclopediaScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_encyclopedia)
                    ),
                    BottomNavItem(
                        name = "Favoritos",
                        route = MainNavigation.FavoritesScreen.FavoritesScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_favorite)
                    ),
                ),
                navController = tabNavHostController,
                onItemClick = {
                    tabNavHostController.navigate(it.route) {
                        popUpTo(tabNavHostController.graph.findStartDestination().id) {
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
                MainNavigation(
                    mainNavHostController = mainNavHostController,
                    tabNavHostController = tabNavHostController
                )
            }
        }
    )
}