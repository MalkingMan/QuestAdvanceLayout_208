package com.example.advancelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface // Import Surface
import androidx.compose.ui.Modifier
import com.example.advancelayout.ui.theme.AdvancelayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdvancelayoutTheme {
                // Ganti Scaffold dan Greeting dengan Surface dan ActivitasPertama
                Surface(modifier = Modifier.fillMaxSize()) {
                    // Panggil Composable dari UiPertama.kt di sini
                    ActivitasContoh()
                }
            }
        }
    }
}
