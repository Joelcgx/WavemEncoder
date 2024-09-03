package com.afterloop.wavemencoder.logic.routes

sealed class BottomNavigationBarRoutes(
    val route: String = ""
) {
    data object Audio : BottomNavigationBarRoutes("audios")
    data object MyCreates : BottomNavigationBarRoutes("myCreates")
    data object Settings : BottomNavigationBarRoutes("settings")
}