package com.mmj.lifecycle.presentation.util.resource.route

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mmj.lifecycle.presentation.first.FirstScreen
import com.mmj.lifecycle.presentation.second.SecondScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreen.FirstScreen.route,
    ) {

        composable(route = AppScreen.FirstScreen.route) {
            FirstScreen(navController)
        }

        composable(route = AppScreen.SecondScreen.route) {
            SecondScreen()
        }
    }
}