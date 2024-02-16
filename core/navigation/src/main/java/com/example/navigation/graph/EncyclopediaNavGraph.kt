package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.encyclopedia.ui.EncyclopediaScreen
import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.encyclopedia.EncyclopediaRoutes

internal fun NavGraphBuilder.addEncyclopediaNavGraph() {
    navigation(
        route = Destination.Encyclopedia.route,
        startDestination = EncyclopediaRoutes.Encyclopedia.createRoute()
    ) {
        composable(
            route = EncyclopediaRoutes.Encyclopedia.createRoute(),
            content = {
                EncyclopediaScreen()
            }
        )
    }
}