package com.example.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.encyclopedia.ui.EncyclopediaScreen
import com.example.favorites.ui.FavoritesScreen
import com.example.home.home.ui.HomeScreen
import com.example.home.home2.HomeScreen2
import com.example.home.home3.HomeScreen3
import com.example.quiz.ui.QuizScreen


object MainNavigation {
    object Routes {
        const val HomeRoute = "home"
        const val QuizRoute = "quiz"
        const val FavoritesRoute = "favorites"
        const val EncyclopediaRoute = "encyclopedia"
    }

    object HomeScreen {
        const val HomeScreen = "home_screen"
        const val HomeScreen2 = "home_screen2"
        const val HomeScreen3 = "home_screen3"
    }

    object QuizScreen {
        const val QuizScreen = "quiz_screen"
    }

    object FavoritesScreen {
        const val FavoritesScreen = "favorites_screen"
    }

    object EncyclopediaScreen {
        const val EncyclopediaScreen = "encyclopedia_screen"
    }
}

@Composable
fun MainNavigation(mainNavHostController: NavController, tabNavHostController: NavHostController) {
    NavHost(
        navController = tabNavHostController,
        startDestination = MainNavigation.Routes.HomeRoute
    ) {
        navigation(
            startDestination = MainNavigation.HomeScreen.HomeScreen,
            route = MainNavigation.Routes.HomeRoute
        ) {
            composable(MainNavigation.HomeScreen.HomeScreen) {
                HomeScreen(
                    onClickNavigateToOtherModule = {
                        tabNavHostController.navigate(MainNavigation.Routes.QuizRoute)
                    },
                    onClickNavigateToHome2WithBar = {
                        tabNavHostController.navigate(MainNavigation.HomeScreen.HomeScreen2)
                    },
                    onClickNavigateToHome2NoBar = {
                        mainNavHostController.navigate("out_home_screen2")
                    }
                )

            }
            composable(MainNavigation.HomeScreen.HomeScreen2) {
                HomeScreen2(
                    onClickNavigateToEncyclopediaModule = {
                        tabNavHostController.navigate(MainNavigation.Routes.EncyclopediaRoute)
                    },
                    onClickNavigateToHome3 = {
                        tabNavHostController.navigate(MainNavigation.HomeScreen.HomeScreen3)
                    }
                )
            }
            composable(MainNavigation.HomeScreen.HomeScreen3) {
                HomeScreen3(
                    onClickNavigateToFavoritesModule = {
                        tabNavHostController.popBackStack(
                            MainNavigation.HomeScreen.HomeScreen2,
                            true
                        )
                        tabNavHostController.navigate(MainNavigation.FavoritesScreen.FavoritesScreen)
                    },
                    onClickNavigateToHome = {
                        tabNavHostController.popBackStack(
                            MainNavigation.HomeScreen.HomeScreen2,
                            true
                        )
                    }
                )
            }


        }
        navigation(
            startDestination = MainNavigation.QuizScreen.QuizScreen,
            route = MainNavigation.Routes.QuizRoute
        ) {
            composable(MainNavigation.QuizScreen.QuizScreen) {
                QuizScreen()
            }
        }
        navigation(
            startDestination = MainNavigation.FavoritesScreen.FavoritesScreen,
            route = MainNavigation.Routes.FavoritesRoute
        ) {
            composable(MainNavigation.FavoritesScreen.FavoritesScreen) {
                FavoritesScreen()
            }
        }
        navigation(
            startDestination = MainNavigation.EncyclopediaScreen.EncyclopediaScreen,
            route = MainNavigation.Routes.EncyclopediaRoute
        ) {
            composable(MainNavigation.EncyclopediaScreen.EncyclopediaScreen) {
                EncyclopediaScreen()
            }
        }

    }
}