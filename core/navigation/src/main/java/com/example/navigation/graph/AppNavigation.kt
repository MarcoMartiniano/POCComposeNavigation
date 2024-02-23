package com.example.navigation.graph


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.home.home2.HomeScreen2
import com.example.main.MainScreen
import com.example.navigation.destination.core.Destination


@Composable
fun AppNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Destination.Main.route
    ) {
        addEncyclopediaNavGraph()
        addFavoritesNavGraph()
        addHomeNavGraph(navController)
        addMainNavGraph()
        addQuizNavGraph()
    }
}
@Composable

fun AppNavigation2(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "tabs") {

//        navigation(startDestination = "username", route = "login") {
//            composable(route = "username") {
//                Column(
//                    modifier = Modifier.fillMaxSize(),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(
//                        text = "Username",
//                        style = MaterialTheme.typography.headlineMedium
//                    )
//                    TextButton(onClick = {
//                        navController.navigate("password")
//                    }) {
//                        Text(text = "Next")
//                    }
//                }
//            }
//            composable(route = "password") {
//                Column(
//                    modifier = Modifier.fillMaxSize(),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(
//                        text = "Password",
//                        style = MaterialTheme.typography.headlineMedium
//                    )
//                    TextButton(onClick = {
//                        navController.navigate("tabs") {
//                            // clear back stack for nested navigation
//                            popUpTo("login")
//                        }
//                    }) {
//                        Text(text = "Submit and Go To Home")
//                    }
//                }
//            }
//        }


        composable(route = "tabs") {
            //pas this nav controller for navigating to outer_profile_detail
            //TabsNavGraph(navController)
            MainScreen(navController)
        }

        composable(route = "out_home_screen2") {
            HomeScreen2(navController = navController)
        }

        //Outer Profile Detail, without bottom bar
//        composable(route = "outer_profile_detail") {
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(
//                    text = "Outer Profile Detail Without Bottom bar",
//                    style = MaterialTheme.typography.headlineMedium
//                )
//                TextButton(onClick = {
//                    navController.popBackStack()
//                }) {
//                    Text(text = "Go Back")
//                }
//            }
//        }

//        // Optional arguments
//        composable(
//            route = "account?userId={userId}",
//            arguments = listOf(navArgument("userId") { defaultValue = "1" })
//        ) { backStackEntry ->
//            val userId = backStackEntry.arguments?.getString("userId")
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(
//                    text = "Account Screen",
//                    style = MaterialTheme.typography.headlineMedium
//                )
//                Text(text = "userId=$userId")
//                TextButton(onClick = {
//                    navController.popBackStack()
//                }) {
//                    Text(text = "Go Back")
//                }
//            }
//        }
    }
}
//@Composable
//fun TabsNavGraph(mainNavHostController: NavHostController) {
//    val navController = rememberNavController()
//    Scaffold(
//        bottomBar = {
//            NavigationBar {
//                val backStackEntry by navController.currentBackStackEntryAsState()
//                val currentDestination = backStackEntry?.destination
//                items.forEach { screen ->
//                    NavigationBarItem(
//                        selected = currentDestination?.hierarchy?.any {
//                            it.route == screen.route
//                        } == true,
//                        label = { Text(stringResource(screen.resource)) },
//                        icon = {
//                            Icon(
//                                imageVector = if (screen.route == "home") Icons.Default.Home else Icons.Default.AccountBox,
//                                contentDescription = null
//                            )
//                        },
//                        onClick = {
//                            navController.navigate(screen.route) {
//
//
//                                // findStartDestination -> Finds the actual start destination of the graph,
//                                // handling cases where the graph's starting destination is itself a NavGraph(nested navigation)
//
//                                // popUpTo :-  clears the back stack and the state of all
//                                // destinations between the current destination and the NavOptionsBuilder.popUpTo ID
//                                // But if we use saveState = true, it will save that state( back stack and the state of all
//                                // destinations between the current destination and the NavOptionsBuilder.popUpTo ID)
//                                // before it clears backstack entries upto popUpTo ID,
//                                // and later it restore that backstack if we use restoreState = true
//                                popUpTo(navController.graph.findStartDestination().id) {
//                                    saveState = true
//                                }
//
//                                launchSingleTop = true
//
//                                restoreState = true
//
//                            }
//                        },
//                    )
//                }
//            }
//        }
//    ) { innerPadding ->
//
//        NavHost(
//            navController = navController,
//            startDestination = "home",
//            modifier = Modifier.padding(innerPadding)
//        ) {
//            navigation(startDestination = "dashboard", route = "home") {
//                composable(route = "dashboard") {
//                    Column(
//                        modifier = Modifier.fillMaxSize(),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Text(
//                            text = "Home",
//                            style = MaterialTheme.typography.headlineMedium
//                        )
//                        TextButton(onClick = {
//                            navController.navigate("profile_detail")
//                        }) {
//                            Text(text = "Go To Nested Profile Detail")
//                        }
//                        TextButton(onClick = {
//                            //use mainNavHostController for navigating to outer_profile_detail
//                            mainNavHostController.navigate("outer_profile_detail")
//                        }) {
//                            Text(text = "Go To Outer Profile Detail")
//                        }
//                    }
//                }
//                composable(route = "profile_detail") {
//                    Column(
//                        modifier = Modifier.fillMaxSize(),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Text(
//                            text = "Profile Detail",
//                            style = MaterialTheme.typography.headlineMedium
//                        )
//                        TextButton(onClick = {
//                            navController.popBackStack()
//                        }) {
//                            Text(text = "Go Back")
//                        }
//                    }
//                }
//            }
//            composable(route = "profile") {
//                Column(
//                    modifier = Modifier.fillMaxSize(),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(
//                        text = "User Profile",
//                        style = MaterialTheme.typography.headlineMedium
//                    )
//                }
//            }
//        }
//
//    }
//}