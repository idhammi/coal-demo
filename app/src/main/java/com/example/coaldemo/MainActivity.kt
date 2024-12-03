package com.example.coaldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.composable
import com.example.coaldemo.config.ForgotPasswordConfig
import com.example.coaldemo.config.LoginConfig
import com.example.coaldemo.config.NetworkConfig
import com.example.coaldemo.config.RegisterConfig
import com.example.coaldemo.config.SplashConfig
import com.example.coaldemo.config.VerificationConfig
import com.example.coaldemo.ui.navigation.AppScreen
import com.example.coaldemo.ui.user.UserScreen
import com.telkom.coal.core.network.base.NetworkConfigProvider
import com.telkom.coal.core.network.retrofit.url.BaseUrlProvider
import com.telkom.coal.core.ui.config.UiConfig
import com.telkom.coal.core.ui.config.UiConfigProvider
import com.telkom.coal.core.ui.theme.CoalTheme
import com.telkom.coal.framework.screen.CoalFramework
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity(),
    NetworkConfigProvider by NetworkConfig(),
    UiConfigProvider by UiConfig() {

    @Inject
    lateinit var baseUrlProvider: BaseUrlProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            baseUrlProvider.setBaseUrl(getBaseUrl())

            registerCoalConfig(
                SplashConfig(),
                LoginConfig(),
                ForgotPasswordConfig(),
                RegisterConfig(),
                VerificationConfig()
            )
            CoalTheme {
                CoalFramework(
                    startDestination = AppScreen.User,
                    configs = uiConfigs
                ) {
                    composable<AppScreen.User> {
                        UserScreen()
                    }
                }
            }
        }
    }
}