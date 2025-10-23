package com.example.advancelayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip // Diperlukan untuk .clip()
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight // Diperlukan untuk FontWeight.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.advancelayout.R // Import yang paling penting

@Composable
fun ActivitasContoh(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Teknologi Informasi", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Text("Universitas Muhammadiyah Yogyakarta", fontSize = 18.sp)

        Spacer(modifier = Modifier.height(25.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(id = R.drawable.gambar)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Bambang Sumantri",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )
                    Text(
                        text = "Turi, Sleman",
                        fontSize = 16.sp,
                        color = Color.Yellow
                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF0026FF))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(id = R.drawable.gambar)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text("Isi Nama", fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
                    Text("Isi Alamat", fontSize = 16.sp, color = Color.Cyan)
                    Text("Isi No Handphone", fontSize = 14.sp, color = Color.White)
                }
            }
        }


        Spacer(modifier = Modifier.weight(1f))
        Text("copyright, 2025", fontSize = 12.sp, modifier = Modifier.padding(bottom = 20.dp))
    }
}
