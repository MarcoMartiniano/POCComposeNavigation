package com.example.home.home.ui

import androidx.navigation.NavController

sealed class HomeViewAction {

    object Navigate {
        data class QuizScreen(val navController: NavController) : HomeViewAction()
        data class Home2Screen(val navController: NavController) : HomeViewAction()
    }
}