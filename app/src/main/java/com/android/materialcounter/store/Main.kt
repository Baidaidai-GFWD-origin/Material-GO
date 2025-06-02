package com.android.materialcounter.store

import android.app.Activity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import androidx.lifecycle.ViewModel
import com.android.materialcounter.data.TodoData
import com.android.materialcounter.data.TodoDataList

data class ToDoUiState(  // Data Area
    val currentDialogVisibility: Boolean = true,
)

class ToDoViewModel:ViewModel(){  // Logic Area
    private val _uiState = MutableStateFlow(ToDoUiState())
    val uiState: StateFlow<ToDoUiState> = _uiState.asStateFlow()

    fun changeDialogVisibility(){
        _uiState.update { ToDoUiState ->
            val currentDialogVisibility = ToDoUiState.currentDialogVisibility
            ToDoUiState.copy(currentDialogVisibility = !currentDialogVisibility)
        }
    }

    fun addToDoItems(todo: String){
        TodoDataList.add(TodoData(todo = todo ))
        changeDialogVisibility()
    }
}
private fun TEST(){

}