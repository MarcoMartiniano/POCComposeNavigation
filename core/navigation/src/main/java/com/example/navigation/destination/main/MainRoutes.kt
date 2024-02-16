package com.example.navigation.destination.main

import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.core.LeafDestination

object MainRoutes {
    object Main : LeafDestination(
        root = Destination.Main,
        route = "main"
    )
}