package com.android.materialcounter.components.todocard

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TodoWord(
    text: String,
    modifier: Modifier
){
    Text(
        text = text,
        modifier = modifier
            .padding(
                start = 10.dp
            ),
        style = MaterialTheme.typography.labelLarge
    )
}