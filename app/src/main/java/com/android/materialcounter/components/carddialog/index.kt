package com.android.materialcounter.components.carddialog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardDialog(modifier: Modifier = Modifier){

    var isAlertDialogCanShow by remember { mutableStateOf(true) }
    var innerText by remember { mutableStateOf("") }

    if(isAlertDialogCanShow){
        BasicAlertDialog(
            onDismissRequest = { isAlertDialogCanShow = false },
            modifier = modifier
        ){

            Surface(
                modifier = Modifier,
                shape = MaterialTheme.shapes.large
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        "To Add TODOs",
                        style = MaterialTheme.typography.titleSmall
                    )
                    Spacer(modifier = modifier.height(10.dp))
                    OutlinedTextField(
                        value = innerText,
                        onValueChange = { it ->
                            innerText = it
                        },
                        enabled = true,
                        modifier = modifier
                            .padding(0.dp)
                    )
                    CardButtons(
                        modifier = modifier,
                        confirmClicker = {  },
                        dismissClicker = { isAlertDialogCanShow = false }
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun CardDialogPreview(){
    CardDialog(modifier = Modifier)
}