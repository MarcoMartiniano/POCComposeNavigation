package com.example.home.ui

import androidx.navigation.NavController

sealed class HomeViewAction {

    object Navigate {
        data class QuizScreen(val navController: NavController) : HomeViewAction()
    }
}