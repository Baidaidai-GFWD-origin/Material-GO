package com.android.materialcounter.components.todocard

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable

@Composable
fun CheckBox(
    checked: Boolean,
    onChecked:(Boolean)-> Unit
){
    Checkbox(
        checked = checked,
        onCheckedChange = onChecked,
        enabled = true,
    )
}