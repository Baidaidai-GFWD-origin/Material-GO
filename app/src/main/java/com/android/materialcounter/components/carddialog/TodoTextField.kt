package com.android.materialcounter.components.carddialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TodoTextField(
    modifier: Modifier = Modifier,
    innerText:String,
    onValueChange:(String)-> Unit
){
    OutlinedTextField(
        value = innerText,
        onValueChange = { it->
            onValueChange(it)
        },
        enabled = true,
        modifier = modifier
            .padding(0.dp)
            .fillMaxWidth(),
        label = {
            Text(
                text = "Todos✏️",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    )
}