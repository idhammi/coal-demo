package com.example.coaldemo.config

import com.telkom.coal.core.ui.config.ConfigSource
import com.telkom.coal.core.ui.config.register.RegisterConfigProvider

class RegisterConfig : RegisterConfigProvider {

    override fun configSource(): ConfigSource {
        return ConfigSource.LOCAL
    }
}