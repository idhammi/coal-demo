package com.example.coaldemo.config

import androidx.compose.ui.graphics.Color
import com.example.coaldemo.R
import com.telkom.coal.core.ui.config.login.LoginConfigProvider

class LoginConfig : LoginConfigProvider {

    override fun getHeaderIcon() = R.drawable.ic_launcher_foreground

    override fun getButtonLoginColor() = Color.Green

    override fun getHeaderTitle() = "Coal Demo Login"

    override fun showForgotPassword() = false

    override fun getEmailLabel(): String? {
        return "Email"
    }

    override fun getEmailPlaceholder(): String? {
        return "Enter your email"
    }

}