package com.mmj.lifecycle.presentation.util.resource.route

sealed class AppScreen(val route: String) {
    object FirstScreen : AppScreen(ConstantAppScreenName.FIRST_SCREEN)
    object SecondScreen : AppScreen(ConstantAppScreenName.SECOND_SCREEN)
}


object ConstantAppScreenName {
    const val FIRST_SCREEN = "first_screen"
    const val SECOND_SCREEN = "second_screen"
}