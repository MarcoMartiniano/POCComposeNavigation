package com.example.navigation.graph


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.commons.utils.NavigationRoutes


@Composable
fun AppNavigation(
    mainNavHostController: NavHostController,
    tabNavHostController: NavHostController,
) {
    NavHost(
        navController = mainNavHostController,
        startDestination = NavigationRoutes.Routes.MainRoute
    ) {
        addMainNavGraph(
            tabNavHostController = tabNavHostController,
        )
        addHomeOutTabNavGraph(
            tabNavHostController = tabNavHostController,
            mainNavHostController = mainNavHostController
        )
    }
}