package com.android.materialcounter.components.carddialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
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
import com.android.materialcounter.store.ToDoViewModel
import com.android.materialcounter.ui.theme.AppTheme
import android.app.Activity
import androidx.compose.ui.platform.LocalContext


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardDialog(
    modifier: Modifier = Modifier,
    signals: Boolean = true,
    changeableHandler:()-> Unit,
    addItems: ToDoViewModel
){

    var innerText by remember { mutableStateOf("") }

    if(signals){
        BasicAlertDialog(
            onDismissRequest = changeableHandler,
            modifier = modifier
        ){

            Surface(
                shape = MaterialTheme.shapes.large,
                modifier = modifier

            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp,16.dp,16.dp)
                        .background(color = MaterialTheme.colorScheme.surface)
                ) {
                    Text(
                        "To Add TODOs",
                        style = MaterialTheme.typography.titleSmall
                    )
                    Spacer(modifier = modifier.height(10.dp))
                    TodoTextField(
                        modifier = modifier,
                        innerText = innerText,
                        onValueChange = { it->
                            innerText = it
                        }
                    )
                    val context = LocalContext.current
                    CardButtons(
                        modifier = modifier,
                        confirmClicker = {addItems.addToDoItems(innerText)},
                        dismissClicker = changeableHandler
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun CardDialogPreview(){
    AppTheme {
//        CardDialog(modifier = Modifier,true,{},)
    }
}