package com.example.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.encyclopedia.ui.EncyclopediaScreen
import com.example.favorites.ui.FavoritesScreen
import com.example.home.ui.HomeScreen
import com.example.quiz.ui.QuizScreen

@Composable
fun MainNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = MainNavigation.HomeScreen) {
        composable(MainNavigation.HomeScreen) {
            HomeScreen(navController = navController)
        }
        composable(MainNavigation.QuizScreen) {
            QuizScreen()
        }
        composable(MainNavigation.FavoritesScreen) {
            FavoritesScreen()
        }
        composable(MainNavigation.EncyclopediaScreen) {
            EncyclopediaScreen()
        }

    }
}

object MainNavigation {
    const val QuizScreen = "quiz"
    const val HomeScreen = "home"
    const val FavoritesScreen = "favorites"
    const val EncyclopediaScreen = "encyclopedia"
}