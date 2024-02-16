package com.example.navigation.graph


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigation.destination.core.Destination


@Composable
fun AppNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Destination.Main.route
    ) {
        addEncyclopediaNavGraph()
        addFavoritesNavGraph()
        addHomeNavGraph(navController)
        addMainNavGraph()
        addQuizNavGraph()
    }
}