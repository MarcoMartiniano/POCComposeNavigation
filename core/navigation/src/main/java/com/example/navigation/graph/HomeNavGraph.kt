package com.example.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.home.HomeRoutes

internal fun NavGraphBuilder.addHomeNavGraph(
    navController: NavController,
) {
    navigation(
        route = Destination.Home.route,
        startDestination = HomeRoutes.Home.createRoute()
    ) {
//        composable(
//            route = HomeRoutes.Home.createRoute(),
//            content = {
//                HomeScreen(navController = navController)
//            }
//        )
//        composable(
//            route = HomeRoutes.Home2.createRoute(),
//            content = {
//                HomeScreen2(navController = navController)
//            }
//        )
    }
}