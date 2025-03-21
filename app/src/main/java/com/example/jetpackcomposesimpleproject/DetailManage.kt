package com.example.jetpackcomposesimpleproject

import androidx.compose.runtime.mutableStateOf

object DetailManage {
    val list = mutableListOf<Book>()
    var bookDetail:Book? =null
    var currentPage = mutableStateOf(Screen.AddDetailScreen)
    fun addData(name: String, bookName: String, detail: String) {
        list.add(Book(name, bookName, detail))
    }

    fun pageManage(book : Book?) {
        if (currentPage.value == Screen.AddDetailScreen && book == null) {
            currentPage.value = Screen.DetailList
        } else if(book!=null){
            currentPage.value = Screen.DetailScreen
            bookDetail = book
        }else{
            currentPage.value = Screen.AddDetailScreen
        }

    }
}