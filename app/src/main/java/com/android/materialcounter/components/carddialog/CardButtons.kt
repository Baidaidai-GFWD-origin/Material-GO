package com.android.materialcounter.components.carddialog

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color


@Composable
fun CardButtons(
    modifier: Modifier = Modifier,
    confirmClicker:()-> Unit,
    dismissClicker:()-> Unit
){
    Row(
        modifier = modifier
            .fillMaxWidth()
        ,
        horizontalArrangement = Arrangement.End
    ) {
        TextButton(
            onClick = dismissClicker,
        ) {
            Text(
                text = "Dismiss",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.titleMedium
            )
        }
        TextButton(
            onClick = confirmClicker,
        ) {
            Text(
                text = "Confirm",
                style = MaterialTheme.typography.titleMedium
            )
        }

    }
}