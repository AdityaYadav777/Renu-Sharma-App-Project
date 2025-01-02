package com.renuSh.renusharmaappproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.renuSh.renusharmaappproject.ui.theme.RenuSharmaAppProjectTheme
import com.renush.home.Routes.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RenuSharmaAppProjectTheme {

                Navigation()

            }
        }
    }
}



