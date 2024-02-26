package com.example.navigation.graph

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.commons.utils.NavigationRoutes
import com.example.main.MainScreen

internal fun NavGraphBuilder.addMainNavGraph(
    tabNavHostController: NavHostController,
    mainNavHostController: NavController,
) {
    composable(route = NavigationRoutes.Routes.MainRoute) {
        MainScreen(
            tabNavHostController = tabNavHostController,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues = it)
                ) {
                    MainNavigation(
                        mainNavHostController = mainNavHostController,
                        tabNavHostController = tabNavHostController
                    )
                }
            }
        )
    }
}