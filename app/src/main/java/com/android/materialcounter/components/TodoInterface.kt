package com.android.materialcounter.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.materialcounter.components.headcard.HeadCard
import com.android.materialcounter.components.todocard.TodoCard
import com.android.materialcounter.data.TodoDataList
import com.android.materialcounter.ui.theme.AppTheme

@Composable
fun TodoList(){
    Scaffold(
        topBar ={
            HeadCard()
        }
    ) { it ->
        val TodoDataList = TodoDataList()
        LazyColumn(contentPadding = it) {
            items(TodoDataList.size) {
                TodoCard(todoData = TodoDataList[it])
            }
        }
    }
}

@Composable @Preview
private fun TodoListPreView(){
    AppTheme {
        TodoList()
    }
}