package com.example.coaldemo.config

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import com.telkom.coal.core.model.BottomNav
import com.telkom.coal.core.ui.config.menu.MenuConfigProvider
import com.telkom.coal.core.ui.navigation.CoalScreen

class MenuConfig : MenuConfigProvider {

    override fun bottomNavItem() = listOf(
        BottomNav.CoalItem(
            menuTitle = "Home",
            menuIcon = Icons.Filled.Home,
            screen = CoalScreen.Home,
            config = HomeConfig()
        ),
        BottomNav.CoalItem(
            menuTitle = "Search",
            menuIcon = Icons.Filled.Search,
            screen = CoalScreen.Web(
                initialUrl = "https://www.google.co.id/",
                fullScreen = true,
            ),
            config = WebConfig()
        ),
    )
}
