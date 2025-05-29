package com.android.materialcounter.components.todocard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.materialcounter.ui.theme.AppTheme

import com.android.materialcounter.data.TodoData

@Composable
fun TodoCard(
    modifier: Modifier = Modifier,
    todoData: TodoData
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp,end = 10.dp, bottom = 10.dp)
    ) {
        var clicked by remember { mutableStateOf(false) }
        var checked by remember { mutableStateOf(false) }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            CardIcons(clicked)
            TodoWord(text = todoData.todo,modifier = modifier)
            Spacer(modifier = modifier.weight(1f))
            CheckBox(checked = checked , onChecked = { checked = !checked;clicked = !clicked })
        }
    }
}

@Composable
@Preview
private fun ShowCard(){
    val TodoData = TodoData(todo = "好看吗？傻逼学人精")
    AppTheme {
        TodoCard(todoData = TodoData)
    }
}