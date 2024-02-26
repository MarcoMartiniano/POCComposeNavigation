package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.commons.utils.NavigationRoutes
import com.example.quiz.ui.QuizScreen

internal fun NavGraphBuilder.addQuizNavGraph() {
    navigation(
        startDestination = NavigationRoutes.QuizScreen.QuizScreen,
        route = NavigationRoutes.Routes.QuizRoute
    ) {
        composable(NavigationRoutes.QuizScreen.QuizScreen) {
            QuizScreen()
        }
    }
}