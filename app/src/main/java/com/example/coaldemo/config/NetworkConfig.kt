package com.example.coaldemo.config

import com.telkom.coal.core.network.base.NetworkConfigProvider

class NetworkConfig: NetworkConfigProvider {

    override fun getBaseUrl(): String {
        return "https://coal.wiremockapi.cloud/"
    }

}