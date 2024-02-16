package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.favorites.ui.FavoritesScreen
import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.favorites.FavoritesRoutes

internal fun NavGraphBuilder.addFavoritesNavGraph() {
    navigation(
        route = Destination.Favorites.route,
        startDestination = FavoritesRoutes.Favorites.createRoute()
    ) {
        composable(
            route = FavoritesRoutes.Favorites.createRoute(),
            content = {
                FavoritesScreen()
            }
        )
    }
}