package com.example.uikit.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.uikit.models.BottomNavItem
import com.example.uikit.theme.Black
import com.example.uikit.theme.LightGold
import com.example.uikit.theme.Red

@Composable
fun QuizBottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit,
    testTag: String? = null,
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    Column {
        BottomNavigation(
            modifier = modifier
                .fillMaxWidth(),
            backgroundColor = LightGold
        ) {
            items.forEach { item ->
                val selected = item.route == backStackEntry.value?.destination?.route
                BottomNavigationItem(
                    modifier = Modifier.testTag(testTag ?: "BooksBottomNavigationBarItem"),
                    selected = selected,
                    selectedContentColor = Red,
                    unselectedContentColor = Black,
                    onClick = { onItemClick(item) },
                    icon = {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.name
                            )
                            Spacer(Modifier.height(5.dp))
                            Text(
                                text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                )
            }
        }
    }
}