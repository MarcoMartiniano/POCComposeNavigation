package com.example.home.ui


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
        }
    }

}