package com.example.navigation.destination.quiz

import com.example.navigation.destination.core.Destination
import com.example.navigation.destination.core.LeafDestination

object QuizRoutes {
    object Quiz : LeafDestination(
        root = Destination.Quiz,
        route = "quiz"
    )
}