package com.example.coaldemo.config

import com.telkom.coal.core.network.base.NetworkConfig

class NetworkConfigProvider: NetworkConfig {

    override fun getBaseUrl(): String {
        return "https://api-engine-two.vercel.app/"
    }

}