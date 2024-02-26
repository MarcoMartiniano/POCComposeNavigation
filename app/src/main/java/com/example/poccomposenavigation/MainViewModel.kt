package com.example.poccomposenavigation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import com.example.navigation.destination.core.NavigationCommand
import com.example.navigation.destination.core.NavigationManager
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainViewModel : ViewModel(), KoinComponent {

    private val navigationManager: NavigationManager by inject()

    fun initNavigation(
        mainNavHostController: NavHostController,
        tabNavHostController: NavHostController,
    ) {
        viewModelScope.launch {
            navigationManager.commands.collect { command ->
                when (command) {
                    NavigationCommand.NavigateUp -> mainNavHostController.navigateUp()
                    NavigationCommand.PopStackBack -> mainNavHostController.popBackStack()
                    is NavigationCommand.Navigate -> mainNavHostController.navigate(
                        route = command.destination,
                        navOptions = command.navOptions
                    )

                    is NavigationCommand.BottomBarNavigate -> tabNavHostController.navigate(
                        route = command.destination,
                        navOptions = command.navOptions
                    )
                }
            }
        }
    }
}