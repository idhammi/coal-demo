package com.example.coaldemo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.coaldemo.config.CoalConfigDelegate
import com.telkom.coal.core.ui.theme.CoalTheme
import com.telkom.coal.framework.screen.CoalFramework
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : CoalConfigDelegate() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            initCoalConfig()
            CoalTheme {
                CoalFramework(configs = uiConfigs)
            }
        }
    }
}