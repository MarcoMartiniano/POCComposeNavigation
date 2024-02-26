package com.example.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.commons.utils.NavigationRoutes
import com.example.encyclopedia.ui.EncyclopediaScreen
import com.example.favorites.ui.FavoritesScreen
import com.example.home.home.ui.HomeScreen
import com.example.home.home2.HomeScreen2
import com.example.home.home3.HomeScreen3
import com.example.quiz.ui.QuizScreen


@Composable
fun MainNavigation(mainNavHostController: NavController, tabNavHostController: NavHostController) {
    NavHost(
        navController = tabNavHostController,
        startDestination = NavigationRoutes.Routes.HomeRoute
    ) {
        navigation(
            startDestination = NavigationRoutes.HomeScreen.HomeScreen,
            route = NavigationRoutes.Routes.HomeRoute
        ) {
            composable(NavigationRoutes.HomeScreen.HomeScreen) {
                HomeScreen(
                    onClickNavigateToOtherModule = {
                        tabNavHostController.navigate(NavigationRoutes.Routes.QuizRoute)
                    },
                    onClickNavigateToHome2WithBar = {
                        tabNavHostController.navigate(NavigationRoutes.HomeScreen.HomeScreen2)
                    },
                    onClickNavigateToHome2NoBar = {
                        mainNavHostController.navigate("out_home_screen2")
                    }
                )

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
        navigation(
            startDestination = NavigationRoutes.QuizScreen.QuizScreen,
            route = NavigationRoutes.Routes.QuizRoute
        ) {
            composable(NavigationRoutes.QuizScreen.QuizScreen) {
                QuizScreen()
            }
        }
        navigation(
            startDestination = NavigationRoutes.FavoritesScreen.FavoritesScreen,
            route = NavigationRoutes.Routes.FavoritesRoute
        ) {
            composable(NavigationRoutes.FavoritesScreen.FavoritesScreen) {
                FavoritesScreen()
            }
        }
        navigation(
            startDestination = NavigationRoutes.EncyclopediaScreen.EncyclopediaScreen,
            route = NavigationRoutes.Routes.EncyclopediaRoute
        ) {
            composable(NavigationRoutes.EncyclopediaScreen.EncyclopediaScreen) {
                EncyclopediaScreen()
            }
        }

    }
}