package com.example.coaldemo.config

import com.example.coaldemo.R
import com.telkom.coal.core.ui.config.ConfigSource
import com.telkom.coal.core.ui.config.login.LoginConfigProvider
import com.telkom.coal.core.ui.config.login.LoginType

class LoginConfig : LoginConfigProvider {

    override fun configSource() = ConfigSource.LOCAL

    override fun headerIcon() = R.drawable.ic_launcher_foreground

    override fun loginType() = LoginType.EMAIL

    override fun otpVerificationEnabled() = true

}