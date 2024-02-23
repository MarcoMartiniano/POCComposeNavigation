package com.example.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.encyclopedia.ui.EncyclopediaScreen
import com.example.favorites.ui.FavoritesScreen
import com.example.home.home.ui.HomeScreen
import com.example.home.home2.HomeScreen2
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
fun MainNavigation2(mainNavHostController: NavHostController, navController: NavController) {
//    val navController = rememberNavController()
    NavHost(navController = mainNavHostController, startDestination = MainNavigation.Routes.HomeRoute) {
        navigation(
            startDestination = MainNavigation.HomeScreen.HomeScreen,
            route = MainNavigation.Routes.HomeRoute
        ) {
            composable(MainNavigation.HomeScreen.HomeScreen) {
                HomeScreen(
                    navController = mainNavHostController,
                    onClickNavigateToOtherModule = {
                        mainNavHostController.navigate(MainNavigation.Routes.QuizRoute)
                    },
                    onClickNavigateToHome2WithBar = {
                        mainNavHostController.navigate(MainNavigation.HomeScreen.HomeScreen2)
                    },
                    onClickNavigateToHome2NoBar = {
                        navController.navigate("out_home_screen2")
                    }
                )
                
            }
            composable(MainNavigation.HomeScreen.HomeScreen2) {
                HomeScreen2(navController = mainNavHostController)
            }
        }
        navigation(
            startDestination = MainNavigation.QuizScreen.QuizScreen,
            route = MainNavigation.Routes.QuizRoute
        ) {
            composable(MainNavigation.QuizScreen.QuizScreen) {
                QuizScreen()
            }
//            composable("quiz2") {
//                QuizScreen2()
//            }
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