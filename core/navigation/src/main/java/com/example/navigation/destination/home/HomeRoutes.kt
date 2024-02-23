package com.example.navigation.destination.home

import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.core.LeafDestination

object HomeRoutes {
    object Home : LeafDestination(
        root = Destination.Home,
        route = "home"
    )
    object Home2 : LeafDestination(
        root = Destination.Home,
        route = "home2"
    )
}