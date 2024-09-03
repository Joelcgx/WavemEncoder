package com.afterloop.wavemencoder.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.afterloop.wavemencoder.logic.navigation.NestedNavigationController

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {}, bottomBar = {}) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            NestedNavigationController(navController = navController)
        }
    }
}