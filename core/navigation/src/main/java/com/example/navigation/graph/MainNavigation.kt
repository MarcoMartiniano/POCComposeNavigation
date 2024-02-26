package com.example.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.commons.utils.NavigationRoutes

@Composable
fun MainNavigation(
    tabNavHostController: NavHostController,
) {
    NavHost(
        navController = tabNavHostController,
        startDestination = NavigationRoutes.Routes.HomeRoute
    ) {
        addHomeNavGraph(
            tabNavHostController = tabNavHostController
        )
        addQuizNavGraph()
        addFavoritesNavGraph()
        addEncyclopediaNavGraph()
    }
}