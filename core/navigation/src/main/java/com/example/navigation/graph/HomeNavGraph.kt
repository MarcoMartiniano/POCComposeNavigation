package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.commons.utils.NavigationRoutes
import com.example.home.home.ui.HomeScreen
import com.example.home.home2.HomeScreen2
import com.example.home.home3.HomeScreen3

internal fun NavGraphBuilder.addHomeNavGraph(
    tabNavHostController: NavHostController,
) {
    navigation(
        startDestination = NavigationRoutes.HomeScreen.HomeScreen,
        route = NavigationRoutes.Routes.HomeRoute
    ) {
        composable(NavigationRoutes.HomeScreen.HomeScreen) {
            HomeScreen()
        }
        composable(NavigationRoutes.HomeScreen.HomeScreen2) {
            HomeScreen2(
                onClickNavigateToEncyclopediaModule = {
                    tabNavHostController.navigate(NavigationRoutes.Routes.EncyclopediaRoute)
                },
                onClickNavigateToHome3 = {
                    tabNavHostController.navigate(NavigationRoutes.HomeScreen.HomeScreen3)
                }
            )
        }
        composable(NavigationRoutes.HomeScreen.HomeScreen3) {
            HomeScreen3(
                onClickNavigateToFavoritesModule = {
                    tabNavHostController.popBackStack(
                        NavigationRoutes.HomeScreen.HomeScreen2,
                        true
                    )
                    tabNavHostController.navigate(NavigationRoutes.FavoritesScreen.FavoritesScreen)
                },
                onClickNavigateToHome = {
                    tabNavHostController.popBackStack(
                        NavigationRoutes.HomeScreen.HomeScreen2,
                        true
                    )
                }
            )
        }
    }
}