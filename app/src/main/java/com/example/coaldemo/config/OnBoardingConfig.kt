package com.example.coaldemo.config

import com.example.coaldemo.R
import com.telkom.coal.core.ui.config.splash.SplashConfigProvider

class OnBoardingConfig: SplashConfigProvider {
    override fun getSplashDrawable(): Int {
        return R.drawable.ic_launcher_foreground
    }
}