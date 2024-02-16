package com.example.navigation.navigation

import androidx.navigation.NavController
import com.example.home.ui.HomeNavigation
import com.example.navigation.destination.core.NavigationManager

class HomeNavigationImpl(
    private val navigationManager: NavigationManager
): HomeNavigation {
    override fun navigateToQuiz(navController: NavController) {
        navigationManager.switchTabs(
//           QuizRoutes.Quiz.createRoute(),
            "quiz",
            navController
        )
    }
}