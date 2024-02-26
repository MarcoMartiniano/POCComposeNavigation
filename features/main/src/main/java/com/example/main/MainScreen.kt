package com.example.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.commons.utils.NavigationRoutes
import com.example.poccomposenavigation.uikit.R
import com.example.uikit.models.BottomNavItem
import com.example.uikit.theme.Black
import com.example.uikit.theme.RoundedCornerShape16top
import com.example.uikit.ui.QuizBottomNavigationBar


@Composable
fun MainScreen(
    tabNavHostController: NavHostController,
    content: @Composable (PaddingValues) -> Unit,
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
                        route = NavigationRoutes.HomeScreen.HomeScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_home)
                    ),
                    BottomNavItem(
                        name = "Quiz",
                        route = NavigationRoutes.QuizScreen.QuizScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_quiz)
                    ),
                    BottomNavItem(
                        name = "Encyclopedia",
                        route = NavigationRoutes.EncyclopediaScreen.EncyclopediaScreen,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_encyclopedia)
                    ),
                    BottomNavItem(
                        name = "Favorites",
                        route = NavigationRoutes.FavoritesScreen.FavoritesScreen,
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
            content(innerPadding)
        }
    )
}