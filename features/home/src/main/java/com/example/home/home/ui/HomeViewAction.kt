package com.example.home.home.ui

sealed class HomeViewAction {

    object Navigate {
        data object QuizModuleScreen : HomeViewAction()
        data object Home2ScreenWithNavigationBar : HomeViewAction()
        data object Home2ScreenWithNoNavigationBar : HomeViewAction()
    }
}