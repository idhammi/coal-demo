package com.example.coaldemo.config

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.telkom.coal.core.ui.config.home.HomeConfigProvider

class HomeConfig : HomeConfigProvider {
    override fun homeSection(): List<@Composable (ColumnScope.() -> Unit)> {
        return listOf {
            Text("Home Screen")
        }
    }
}