package com.example.coaldemo.ui.navigation

import com.telkom.coal.core.ui.navigation.Screen
import kotlinx.serialization.Serializable

sealed class AppScreen: Screen {
    @Serializable
    data object User: AppScreen()
}