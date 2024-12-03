package com.example.coaldemo.config

import com.example.coaldemo.R
import com.telkom.coal.core.ui.config.account.ForgotPasswordConfigProvider

class ForgotPasswordConfig : ForgotPasswordConfigProvider {
    override fun headerIcon(): Int {
        return R.drawable.ic_launcher_foreground
    }
}