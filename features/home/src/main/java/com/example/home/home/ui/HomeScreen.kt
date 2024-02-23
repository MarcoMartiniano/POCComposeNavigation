package com.example.home.home.ui

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
import org.koin.androidx.compose.koinViewModel


@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel(),
    onClickNavigateToOtherModule: () -> Unit,
    onClickNavigateToHome2WithBar: () -> Unit,
    onClickNavigateToHome2NoBar: () -> Unit
) {
    val action: (HomeViewAction) -> Unit = { viewModel.dispatchViewAction(it) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home", fontSize = 36.sp)
        Button(onClick = {
            onClickNavigateToOtherModule.invoke()
        }) {
            Text(text = "Navigate to Other Module")
        }
        Button(onClick = {
            onClickNavigateToHome2WithBar.invoke()
        }) {
            Text(text = "Navigate to Home2 with QuizBottomNavigationBar")
        }
        Button(onClick = {
            onClickNavigateToHome2NoBar.invoke()
        }) {
            Text(text = "Navigate to Home2 without QuizBottomNavigationBar")
        }
    }

}