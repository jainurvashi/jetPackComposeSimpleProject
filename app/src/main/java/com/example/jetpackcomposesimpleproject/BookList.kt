package com.example.jetpackcomposesimpleproject

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
 fun BookList(detailList: MutableList<Book>,onClick :(book:Book)->Unit) {
     BackHandler { DetailManage.pageManage(null) }
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(8.dp)) {
        Text("Book List", style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold)
Spacer(modifier = Modifier.padding(8.dp))
        LazyColumn {
            items(detailList){item->
                BookListScreen(item,onClick)
            }
        }
    }
}