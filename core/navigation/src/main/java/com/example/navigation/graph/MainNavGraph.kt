package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.main.MainScreen
import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.main.MainRoutes

internal fun NavGraphBuilder.addMainNavGraph() {
    navigation(
        route = Destination.Main.route,
        startDestination = MainRoutes.Main.createRoute()
    ) {
        composable(
            route = MainRoutes.Main.createRoute(),
            content = {
                MainScreen()
            }
        )
    }
}