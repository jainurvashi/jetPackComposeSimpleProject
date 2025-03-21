package com.example.jetpackcomposesimpleproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.example.jetpackcomposesimpleproject.ui.theme.JetpackComposeSImpleProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeSImpleProjectTheme {
                val context = LocalContext.current
                if (DetailManage.currentPage.value == Screen.AddDetailScreen) {
                    val name = remember { mutableStateOf("") }
                    val bookName = remember { mutableStateOf("") }
                    val detail = remember { mutableStateOf("") }
                    AddDetailScreen(name, bookName, detail) {
                        if (name.value.isEmpty() || bookName.value.isEmpty()) {
                            Toast.makeText(context, "Please Add Data", Toast.LENGTH_SHORT).show()
                            return@AddDetailScreen
                        }
                        DetailManage.addData(name.value, bookName.value, detail.value)
                        name.value = ""
                        bookName.value = ""
                        detail.value = ""
                        DetailManage.pageManage(null)
                    }
                } else if(DetailManage.currentPage.value == Screen.DetailList){
                    BookList(DetailManage.list){it->
                        DetailManage.pageManage(it)
                    }
                }else{
                    DetailManage.bookDetail?.let { DetailScreen(it) }
                }

            }
        }
    }
}


enum class Screen {
    AddDetailScreen,
    DetailList,
    DetailScreen
}