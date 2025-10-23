package com.example.advancelayout

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.advancelayout.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@composable
fun ActivitasPertama(modifier: Modifier ) {
    Column(modifier = Modifier.padding(top = 100.dp)
        .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(text = stringResource(id = R.string.univ),
            fontSize = 25.sp,)
        Spacer(modifier = Modifier.height(height = 25.dp))
        Card (modifier = Modifier
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.DarkGray)

        )
        {
            Row(){
                val gambar = painterResource(id = R.drawable.gambar)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(size = 100.dp).padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(width = 30.dp))
                Column(){
                    Text(text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = fontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(

                    )

                }



            }
        }


    }
}