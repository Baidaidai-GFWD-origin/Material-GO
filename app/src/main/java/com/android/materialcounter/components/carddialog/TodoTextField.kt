package com.android.materialcounter.components.carddialog

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TodoTextField(
    modifier: Modifier = Modifier
){
    var innerText by remember { mutableStateOf("") }
    OutlinedTextField(
        value = innerText,
        onValueChange = { it ->
            innerText = it
        },
        enabled = true,
        modifier = modifier
            .padding(0.dp)
    )
}