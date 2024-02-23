package com.example.home.home3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun HomeScreen3(
    onClickNavigateToFavoritesModule: () -> Unit,
    onClickNavigateToHome: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home3", fontSize = 36.sp)
        Button(onClick = {
            onClickNavigateToFavoritesModule.invoke()
        }) {
            Text(text = "Navigate to Favorities Module")
        }
        Button(onClick = {
            onClickNavigateToHome.invoke()
        }) {
            Text(text = "Navigate to Home")
        }

    }

}