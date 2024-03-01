package com.example.navigation.navigation

import com.example.commons.utils.NavigationRoutes
import com.example.home.home.ui.HomeNavigation
import com.example.navigation.destination.core.NavigationManager

class HomeNavigationImpl(
    private val navigationManager: NavigationManager,
) : HomeNavigation {
    override fun navigateToQuizModuleScreen() {
        navigationManager.switchTabs(NavigationRoutes.Routes.QuizRoute)
    }

    override fun navigateToHome2ScreenWithNavigationBar() {
        navigationManager.navigate(
            route = NavigationRoutes.HomeScreen.HomeScreen2,
            isBottomNavigation = true
        )
    }

    override fun navigateToHome2ScreenWithNoNavigationBar() {
        navigationManager.navigate(
            route = NavigationRoutes.OutHomeScreen.OutHomeScreen2,
            isBottomNavigation = false
        )
    }
}