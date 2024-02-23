package com.example.navigation.graph

import androidx.compose.runtime.Composable
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
    const val QuizScreen = "quiz_screen"
    const val HomeScreen = "home_screen"
    const val HomeScreen2 = "home2"
    const val FavoritesScreen = "favorites_screen"
    const val EncyclopediaScreen = "encyclopedia_screen"
}

@Composable
fun MainNavigation2(mainNavHostController: NavHostController) {
    val navController = rememberNavController()
    NavHost(navController = mainNavHostController, startDestination = "home") {
        navigation(
            startDestination = "home_screen",
            route = "home"
        ) {
            composable(MainNavigation.HomeScreen) {
                HomeScreen(
                    navController = mainNavHostController,
                    onClickNavigateToOtherModule = {
                        mainNavHostController.navigate("quiz")
                    },
                    onClickNavigateToHome2WithBar = {
                        mainNavHostController.navigate(MainNavigation.HomeScreen2)
                    },
                    onClickNavigateToHome2NoBar = {

                    }
                )
                
            }
            composable(MainNavigation.HomeScreen2) {
                HomeScreen2(navController = mainNavHostController)
            }
        }
        navigation(
            startDestination = "quiz_screen",
            route = "quiz"
        ) {
            composable("quiz_screen") {
                QuizScreen()
            }
//            composable("quiz2") {
//                QuizScreen2()
//            }
        }
        navigation(
            startDestination = "favorites_screen",
            route = "favorites"
        ) {
            composable("favorites_screen") {
                FavoritesScreen()
            }
        }
        navigation(
            startDestination = "encyclopedia_screen",
            route = "encyclopedia"
        ) {
            composable("encyclopedia_screen") {
                EncyclopediaScreen()
            }
        }

    }
}