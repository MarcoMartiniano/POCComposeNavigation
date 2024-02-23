package com.example.navigation.graph


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.home.home2.HomeScreen2
import com.example.home.home3.HomeScreen3
import com.example.main.MainNavigation
import com.example.main.MainScreen


@Composable

fun AppNavigation(
    mainNavHostController: NavHostController,
    tabNavHostController: NavHostController,
) {
    NavHost(navController = mainNavHostController, startDestination = "tabs") {

        composable(route = "tabs") {
            MainScreen(
                mainNavHostController = mainNavHostController,
                tabNavHostController = tabNavHostController
            )
        }

        composable(route = "out_home_screen2") {
            HomeScreen2(
                onClickNavigateToEncyclopediaModule = {
                    mainNavHostController.popBackStack()
                    tabNavHostController.navigate(MainNavigation.EncyclopediaScreen.EncyclopediaScreen)
                },
                onClickNavigateToHome3 = {
                    mainNavHostController.navigate("out_home_screen3")
                }
            )
        }
        composable(route = "out_home_screen3") {
            HomeScreen3(
                onClickNavigateToFavoritesModule = {
                    mainNavHostController.popBackStack(
                        "out_home_screen2",
                        true
                    )
                    tabNavHostController.navigate(MainNavigation.FavoritesScreen.FavoritesScreen)
                },
                onClickNavigateToHome = {
                    mainNavHostController.popBackStack(
                        "out_home_screen2",
                        true
                    )
                }
            )
        }
    }
}