package com.android.materialcounter.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import com.android.materialcounter.components.carddialog.CardDialog
import com.android.materialcounter.components.headcard.HeadCard
import com.android.materialcounter.components.todocard.TodoCard
import com.android.materialcounter.data.TodoDataList
import com.android.materialcounter.ui.theme.AppTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.android.materialcounter.store.ToDoViewModel
import androidx.compose.runtime.getValue

@Composable
fun TodoList(
    toDoViewModel: ToDoViewModel = viewModel()
){
    val toDoUiState by toDoViewModel.uiState.collectAsState()
    Scaffold(
        topBar ={
            HeadCard()
        }
    ) { it ->
        val TodoDataList = TodoDataList
        LazyColumn(contentPadding = it) {
            items(TodoDataList.size) {
                TodoCard(todoData = TodoDataList[it])
            }
        }
        CardDialog(
            signals = toDoUiState.currentDialogVisibility,
            changeableHandler = { toDoViewModel.changeDialogVisibility() },
            addItems = toDoViewModel
        )
    }
}

@Composable @Preview
private fun TodoListPreView(){
    AppTheme {
        TodoList()
    }
}