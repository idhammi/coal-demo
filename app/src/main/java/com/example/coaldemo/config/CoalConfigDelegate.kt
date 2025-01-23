package com.example.coaldemo.config

import androidx.activity.ComponentActivity
import com.telkom.coal.core.network.base.NetworkConfigProvider
import com.telkom.coal.core.network.retrofit.url.BaseUrlProvider
import com.telkom.coal.core.ui.config.UiConfig
import com.telkom.coal.core.ui.config.UiConfigProvider
import javax.inject.Inject

abstract class CoalConfigDelegate :
    ComponentActivity(),
    NetworkConfigProvider by NetworkConfig(),
    UiConfigProvider by UiConfig() {

    @Inject
    lateinit var baseUrlProvider: BaseUrlProvider

    fun initCoalConfig() {
        baseUrlProvider.setBaseUrl(getBaseUrl())
        registerCoalConfig(
            MenuConfig(),
            HomeConfig(),
            ProfileConfig(),
            SplashConfig(),
            LoginConfig(),
            RegisterConfig(),
            VerificationConfig(),
            ForgotPasswordConfig(),
            WebConfig()
        )
    }
}