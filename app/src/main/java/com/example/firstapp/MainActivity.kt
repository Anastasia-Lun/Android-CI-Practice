package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val x =

            setContent {
                FirstAppTheme {
                    GreetingScreen(
                        message = "Hi, my name is Бородавка Анастасія"
                    )
                }
            }
    }
}

@Composable
fun GreetingScreen(message: String) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFD6E7)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = message)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FirstAppTheme {
        GreetingScreen(
            message = "Бородавка Анастасія"
        )
    }
}