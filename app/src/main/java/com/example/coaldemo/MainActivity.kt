package com.example.coaldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.coaldemo.config.LoginConfig
import com.example.coaldemo.config.NetworkConfigProvider
import com.example.coaldemo.config.OnBoardingConfig
import com.example.coaldemo.ui.theme.CoalDemoTheme
import com.telkom.coal.core.network.base.NetworkConfig
import com.telkom.coal.core.network.retrofit.url.BaseUrlProvider
import com.telkom.coal.core.ui.config.UiConfig
import com.telkom.coal.core.ui.config.UiConfigProvider
import com.telkom.coal.core.ui.navigation.RootNav
import com.telkom.coal.framework.screen.CoalFramework
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity(),
    NetworkConfig by NetworkConfigProvider(),
    UiConfig by UiConfigProvider() {

    @Inject
    lateinit var baseUrlProvider: BaseUrlProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            baseUrlProvider.setBaseUrl(getBaseUrl())
            val rootNav = RootNav(rememberNavController())

            registerCoalConfig(
                OnBoardingConfig(),
                LoginConfig()
            )
            CoalDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValue ->
                    CoalFramework(
                        modifier = Modifier.padding(paddingValue),
                        configs = uiConfigs,
                        rootNav = rootNav
                    )
                }
            }
        }
    }
}