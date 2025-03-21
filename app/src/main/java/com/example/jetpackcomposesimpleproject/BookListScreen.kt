package com.example.jetpackcomposesimpleproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
 fun BookListScreen(detail: Book,onClick :(book:Book)->Unit) {
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.padding(8.dp).fillMaxSize().clickable { onClick(detail) }) {
            Row(modifier = Modifier.padding(8.dp)){
                Image(imageVector = Icons.Default.AccountBox, contentDescription = "icon",
                    modifier = Modifier.size(20.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column {
                    Text(detail.name, style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(detail.bookName, style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Thin)

                }
            }
        }

    }