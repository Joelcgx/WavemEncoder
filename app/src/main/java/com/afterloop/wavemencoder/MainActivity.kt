package com.afterloop.wavemencoder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.afterloop.wavemencoder.ui.screens.MainScreen
import com.afterloop.wavemencoder.ui.theme.WavemEncoderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WavemEncoderTheme {
                MainScreen()
            }
        }
    }
}
