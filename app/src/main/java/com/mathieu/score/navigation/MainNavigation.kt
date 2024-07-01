package com.mathieu.score.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mathieu.score.ui.screen.HomeScreen

@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier,
        bottomBar = {
            BottomBar(
                currentRoute = navController.currentDestination?.route,
                onHomeClick = { navController.navigate(Routes.Home) },
            )
        },
    ) {
        NavHost(
            modifier = Modifier.padding(it),
            navController = navController,
            startDestination = Routes.Home,
        ) {
            composable<Routes.Home> {
                HomeScreen()
            }
        }
    }
}

@Composable
fun BottomBar(
    currentRoute: String?,
    onHomeClick: () -> Unit,
) {
    NavigationBar {
        NavigationBarItem(
            selected = currentRoute == Routes.Home.toString(),
            icon = { Icon(imageVector = Icons.Rounded.Home, contentDescription = null) },
            label = { Text("Home") },
            onClick = onHomeClick,
            colors = NavigationBarItemDefaults.colors(
                unselectedIconColor = MaterialTheme.colorScheme.secondary,
                unselectedTextColor = MaterialTheme.colorScheme.secondary,
            ),
        )
    }
}
