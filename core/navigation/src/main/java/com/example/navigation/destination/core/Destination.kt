package com.example.navigation.destination.core

sealed class Destination(val route: String) {
    data object Main : Destination(route = "main")
    data object Quiz : Destination(route = "quiz")
    data object Home : Destination(route = "home")
    data object Favorites : Destination(route = "favorites")
    data object Encyclopedia : Destination(route = "encyclopedia")
}
