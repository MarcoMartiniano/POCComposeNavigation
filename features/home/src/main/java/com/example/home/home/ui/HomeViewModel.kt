package com.example.home.home.ui


import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeViewModel : ViewModel(), KoinComponent {

    private val navigation: HomeNavigation by inject()

    fun dispatchViewAction(viewAction: HomeViewAction) {
        when (viewAction) {

            is HomeViewAction.Navigate.QuizScreen -> {
                navigation.navigateToQuiz(viewAction.navController)
            }
            is HomeViewAction.Navigate.Home2Screen -> {
                navigation.navigateToHome2(viewAction.navController)
            }
        }
    }

}