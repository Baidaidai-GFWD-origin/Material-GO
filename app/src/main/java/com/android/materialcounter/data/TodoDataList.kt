package com.android.materialcounter.data

data class TodoData(
    val todo: String,
)
fun TodoDataList (): MutableList<TodoData> {
    return mutableListOf<TodoData>(
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
}