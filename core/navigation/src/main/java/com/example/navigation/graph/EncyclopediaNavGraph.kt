package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.commons.utils.NavigationRoutes
import com.example.encyclopedia.ui.EncyclopediaScreen

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