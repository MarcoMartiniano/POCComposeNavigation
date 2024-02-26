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
        addHomeNavGraph(
            tabNavHostController = tabNavHostController,
            mainNavHostController = mainNavHostController
        )
        addQuizNavGraph()
        addFavoritesNavGraph()
        addEncyclopediaNavGraph()
    }
}