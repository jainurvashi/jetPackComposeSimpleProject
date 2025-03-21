package com.example.jetpackcomposesimpleproject

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen(book: Book) {
    BackHandler { DetailManage.pageManage(null) }
    Column(verticalArrangement = Arrangement.Center) {
        Card(elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.padding(10.dp))
                Image(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "icon",
                    modifier = Modifier
                        .background(color = Color.Black)
                        .size(20.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
                Text(
                    book.name,
                    modifier = Modifier.padding(2.dp),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    book.bookName,
                    modifier = Modifier.padding(2.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    book.detail,
                    modifier = Modifier.padding(2.dp),
                    style = MaterialTheme.typography.bodySmall
                )

            }
        }

    }
}