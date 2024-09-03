package com.afterloop.wavemencoder.logic.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.afterloop.wavemencoder.logic.routes.BottomNavigationBarRoutes

/**
 *  Navigation controller for the bottom navigation bar.
 *  @param navController: NavHostController
 */
@Composable
fun NestedNavigationController(navController: NavHostController) {
    NavHost(
        navController = navController, startDestination = BottomNavigationBarRoutes.Audio.route
    ) {
        // Audio navigation
        composable(BottomNavigationBarRoutes.Audio.route) {}
    }
}