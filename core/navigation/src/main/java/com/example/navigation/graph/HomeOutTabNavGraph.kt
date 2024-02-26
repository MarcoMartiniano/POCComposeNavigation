package com.example.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.commons.utils.NavigationRoutes
import com.example.home.home2.HomeScreen2
import com.example.home.home3.HomeScreen3

internal fun NavGraphBuilder.addHomeOutTabNavGraph(
    tabNavHostController: NavHostController,
    mainNavHostController: NavController,
) {
    composable(route = NavigationRoutes.OutHomeScreen.OutHomeScreen2) {
        HomeScreen2(
            onClickNavigateToEncyclopediaModule = {
                mainNavHostController.popBackStack()
                tabNavHostController.navigate(NavigationRoutes.EncyclopediaScreen.EncyclopediaScreen)
            },
            onClickNavigateToHome3 = {
                mainNavHostController.navigate(NavigationRoutes.OutHomeScreen.OutHomeScreen3)
            }
        )
    }
    composable(route = NavigationRoutes.OutHomeScreen.OutHomeScreen3) {
        HomeScreen3(
            onClickNavigateToFavoritesModule = {
                mainNavHostController.popBackStack(
                    NavigationRoutes.OutHomeScreen.OutHomeScreen2,
                    true
                )
                tabNavHostController.navigate(NavigationRoutes.FavoritesScreen.FavoritesScreen)
            },
            onClickNavigateToHome = {
                mainNavHostController.popBackStack(
                    NavigationRoutes.OutHomeScreen.OutHomeScreen2,
                    true
                )
            }
        )
    }
}