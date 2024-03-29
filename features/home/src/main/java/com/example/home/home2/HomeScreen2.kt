package com.example.home.home2

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
fun HomeScreen2(
    onClickNavigateToEncyclopediaModule: () -> Unit,
    onClickNavigateToHome3: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home2", fontSize = 36.sp)
        Button(onClick = {
            onClickNavigateToEncyclopediaModule.invoke()
        }) {
            Text(text = "Navigate to Encyclopedia Module")
        }
        Button(onClick = {
            onClickNavigateToHome3.invoke()
        }) {
            Text(text = "Navigate to Home3")
        }
    }

}