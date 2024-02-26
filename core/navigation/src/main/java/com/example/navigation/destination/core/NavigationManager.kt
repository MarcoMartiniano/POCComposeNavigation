package com.example.navigation.destination.core

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavOptions
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.navOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class NavigationManager(
    private val applicationScope: CoroutineScope,
) {
    private val _commands: Channel<NavigationCommand> = Channel(Channel.BUFFERED)
    val commands = _commands.receiveAsFlow()

    private fun navigate(
        route: String,
        navOptions: NavOptions? = null,
        isBottomNavigation: Boolean,
    ) {
        applicationScope.launch {
            if (isBottomNavigation) {
                _commands.send(
                    NavigationCommand.BottomBarNavigate(
                        destination = route,
                        type = NavigationType.NavigateTo,
                        navOptions = navOptions
                    )
                )
            } else {
                _commands.send(
                    NavigationCommand.Navigate(
                        destination = route,
                        type = NavigationType.NavigateTo,
                        navOptions = navOptions
                    )
                )
            }
        }
    }

    fun navigate(
        route: String,
        builder: NavOptionsBuilder.() -> Unit = {
            launchSingleTop = true
        },
        isBottomNavigation: Boolean,
    ) {
        navigate(route, navOptions(builder), isBottomNavigation)
    }

    fun navigateUp() {
        applicationScope.launch {
            _commands.send(NavigationCommand.NavigateUp)
        }
    }

    fun popStackBack() {
        applicationScope.launch {
            _commands.send(NavigationCommand.PopStackBack)
        }
    }

    fun switchTabs(route: String, navController: NavController) {
        navController.navigate(route) {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }

            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true

            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }
}

sealed class NavigationType {

    data object NavigateTo : NavigationType()
}

sealed class NavigationCommand {

    data class Navigate(
        val destination: String,
        val navOptions: NavOptions? = null,
        val type: NavigationType,
    ) : NavigationCommand()

    data object NavigateUp : NavigationCommand()

    data object PopStackBack : NavigationCommand()

    data class BottomBarNavigate(
        val destination: String,
        val navOptions: NavOptions? = null,
        val type: NavigationType,
    ) : NavigationCommand()
}


