package com.example.navigation.navigation

import androidx.navigation.NavController
import com.example.home.home.ui.HomeNavigation
import com.example.navigation.destination.core.NavigationManager
import com.example.navigation.destination.home.HomeRoutes

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

    override fun navigateToHome2(navController: NavController) {
//        navigationManager.navigate(
////            "home/home2"
//            "home2"
//        )
//        navController.navigate("home/home2")
        navController.navigate(HomeRoutes.Home2.createRoute())
    }
}