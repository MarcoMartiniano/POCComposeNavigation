package com.example.navigation.graph


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.commons.utils.NavigationRoutes
import com.example.home.home2.HomeScreen2
import com.example.home.home3.HomeScreen3
import com.example.main.MainScreen


@Composable

fun AppNavigation(
    mainNavHostController: NavHostController,
    tabNavHostController: NavHostController,
) {
    NavHost(navController = mainNavHostController, startDestination = "tabs") {

        composable(route = "tabs") {
            MainScreen(
                tabNavHostController = tabNavHostController,
                content = {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValues = it)
                    ) {
                        MainNavigation(
                            mainNavHostController = mainNavHostController,
                            tabNavHostController = tabNavHostController
                        )
                    }
                }
            )
        }

        composable(route = "out_home_screen2") {
            HomeScreen2(
                onClickNavigateToEncyclopediaModule = {
                    mainNavHostController.popBackStack()
                    tabNavHostController.navigate(NavigationRoutes.EncyclopediaScreen.EncyclopediaScreen)
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
                    tabNavHostController.navigate(NavigationRoutes.FavoritesScreen.FavoritesScreen)
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