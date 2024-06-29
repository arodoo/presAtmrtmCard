/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.presatm_rtmcard.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import com.example.presatm_rtmcard.R
import com.example.presatm_rtmcard.presentation.theme.PresAtmrtmCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)

        setTheme(android.R.style.Theme_DeviceDefault)

        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            SensorDisplay()
        }
    }
}

@Composable
fun SensorDisplay() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        // Ícono de corazón con valor ficticio
        Icon(
            painter = painterResource(id = R.drawable.corazon),
            contentDescription = "Ritmo Cardíaco",
            tint = Color.Red,
            modifier = Modifier.size(24.dp)
        )
        Text(text = "72 bpm", color = Color.White, modifier = Modifier.padding(start = 8.dp))

        Spacer(modifier = Modifier.width(16.dp))

        // Ícono de presión atmosférica con valor ficticio
        Icon(
            painter = painterResource(id = R.drawable.presion),
            contentDescription = "Presión Atmosférica",
            tint = Color.Blue,
            modifier = Modifier.size(24.dp)
        )
        Text(text = "1013 hPa", color = Color.White, modifier = Modifier.padding(start = 8.dp))
    }
}


@Preview
@Composable
fun PreviewMyApp() {
    MyApp()
}