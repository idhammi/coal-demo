package com.example.coaldemo.ui.user

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.telkom.coal.core.ui.component.wrapper.ComposeLocalWrapper
import com.telkom.coal.core.ui.navigation.CoalScreen
import com.telkom.coal.core.ui.navigation.LocalRootNav

@Composable
fun UserScreen(modifier: Modifier = Modifier) {
    val rootNav = LocalRootNav.current
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            rootNav.goTo(CoalScreen.Login)
        }) {
            Text("Go to login screen")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun UserScreen_Preview() {
    ComposeLocalWrapper {
        UserScreen()
    }
}