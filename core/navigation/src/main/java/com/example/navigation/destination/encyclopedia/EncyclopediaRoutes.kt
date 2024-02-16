package com.example.navigation.destination.encyclopedia

import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.core.LeafDestination

object EncyclopediaRoutes {
    object Encyclopedia : LeafDestination(
        root = Destination.Encyclopedia,
        route = "encyclopedia"
    )
}