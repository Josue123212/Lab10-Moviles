package com.example.lab10.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ScreenInicio(navController: NavHostController? = null) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bienvenido a SERIES APP",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Explora, agrega o edita tus series favoritas.",
            style = MaterialTheme.typography.bodyLarge
        )

        // Si quieres un botón que lleve directamente al listado de series
        if (navController != null) {
            Button(onClick = { navController.navigate("series") }) {
                Text("Ir a Series")
            }
        }
    }
}
