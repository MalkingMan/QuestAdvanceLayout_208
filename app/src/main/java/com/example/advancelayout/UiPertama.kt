package com.example.advancelayout

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasContoh() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Teknologi Informasi",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Universitas Muhammadiyah Yogyakarta",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "copyright, 2025",
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }
}
