package com.example.jetpackcomposesimpleproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddDetailScreen(
    name: MutableState<String>,
    bookName: MutableState<String>,
    detail: MutableState<String>,
    onClick: ()->Unit
) {
Box(modifier = Modifier.background(color = Color(0xFFC79898))){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
        Card(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        ) {
            Column(modifier = Modifier.padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                TextField(
                    value = name.value,
                    onValueChange = {name.value=it},
                    placeholder = { Text(stringResource(R.string.enter_name), fontSize = 10.sp) },
                    textStyle = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.height(50.dp),
                    leadingIcon = { Icon(
                        imageVector = Icons.Default.AccountBox, // Using a built-in search icon
                        contentDescription = "name Icon"
                    )
                    }
                )
                TextField(
                    value = bookName.value,
                    onValueChange = {bookName.value=it},
                    placeholder = { Text(stringResource(R.string.enter_book_name), fontSize = 10.sp) },
                    textStyle = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.height(50.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.AccountBox, // Using a built-in search icon
                            contentDescription = "Book Icon"
                        )
                    }
                )
                TextField(
                    value = detail.value,
                    onValueChange = {detail.value=it},
                    placeholder = { Text(stringResource(R.string.enter_details), fontSize = 10.sp) },
                    textStyle = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.height(50.dp),
                    leadingIcon = { Icon(
                        imageVector = Icons.Default.Email, // Using a built-in search icon
                        contentDescription = "detail Icon",
                    )
                    }
                )
                Button(onClick = {
                    onClick()
                }, modifier = Modifier.padding(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue, // Background color
                        contentColor = Color.White  // Text color
                    )
                ) { Text(stringResource(R.string.submit)) }
            }


        }
    }

}

}