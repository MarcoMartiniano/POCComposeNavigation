package com.example.home.home.ui

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeViewModel : ViewModel(), KoinComponent {
    private val navigation: HomeNavigation by inject()

    fun dispatchViewAction(viewAction: HomeViewAction) {
        when (viewAction) {

            is HomeViewAction.Navigate.QuizModuleScreen -> {
                navigation.navigateToQuizModuleScreen()
            }

            is HomeViewAction.Navigate.Home2ScreenWithNavigationBar -> {
                navigation.navigateToHome2ScreenWithNavigationBar()
            }

            is HomeViewAction.Navigate.Home2ScreenWithNoNavigationBar -> {
                navigation.navigateToHome2ScreenWithNoNavigationBar()
            }
        }
    }
}