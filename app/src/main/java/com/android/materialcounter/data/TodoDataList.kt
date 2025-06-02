package com.android.materialcounter.data

data class TodoData(
    val todo: String,
)
var TodoDataList = mutableListOf<TodoData>(
        TodoData(todo = "To Remove Desk"),
        TodoData(todo = "Clean My Room"),
        TodoData(todo = "To Remove Desk"),
        TodoData(todo = "Clean My Room"),
        TodoData(todo = "To Remove Battery"),
        TodoData(todo = "Clean My Room"),
        TodoData(todo = "To Remove Battery"),
        TodoData(todo = "Clean My Room"),
        TodoData(todo = "To Remove Battery")
)