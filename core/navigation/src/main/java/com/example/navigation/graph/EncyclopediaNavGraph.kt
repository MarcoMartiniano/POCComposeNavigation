package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navigation
import com.example.commons.utils.NavigationRoutes
import com.example.encyclopedia.ui.EncyclopediaScreen
import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.encyclopedia.EncyclopediaRoutes

internal fun NavGraphBuilder.addEncyclopediaNavGraph() {
    navigation(
        startDestination = NavigationRoutes.EncyclopediaScreen.EncyclopediaScreen,
        route = NavigationRoutes.Routes.EncyclopediaRoute
    ) {
        composable(NavigationRoutes.EncyclopediaScreen.EncyclopediaScreen) {
            EncyclopediaScreen()
        }
    }
}