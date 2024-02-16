package com.example.navigation.destination.favorites

import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.core.LeafDestination

object FavoritesRoutes {
    object Favorites : LeafDestination(
        root = Destination.Favorites,
        route = "favorites"
    )
}