package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.quiz.QuizRoutes
import com.example.quiz.ui.QuizScreen

internal fun NavGraphBuilder.addQuizNavGraph() {
    navigation(
        route = Destination.Quiz.route,
        startDestination = QuizRoutes.Quiz.createRoute()
    ) {
        composable(
            route = QuizRoutes.Quiz.createRoute(),
            content = {
                QuizScreen()
            }
        )
    }
}