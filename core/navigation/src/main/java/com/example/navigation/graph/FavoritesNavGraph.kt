package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navigation
import com.example.commons.utils.NavigationRoutes
import com.example.favorites.ui.FavoritesScreen
import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.favorites.FavoritesRoutes

internal fun NavGraphBuilder.addFavoritesNavGraph() {
    navigation(
        startDestination = NavigationRoutes.FavoritesScreen.FavoritesScreen,
        route = NavigationRoutes.Routes.FavoritesRoute
    ) {
        composable(NavigationRoutes.FavoritesScreen.FavoritesScreen) {
            FavoritesScreen()
        }
    }
}