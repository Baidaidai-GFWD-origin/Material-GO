package com.android.materialcounter.components.headcard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.android.materialcounter.R
import com.android.materialcounter.store.ToDoViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeadCard(
    toDoViewModel: ToDoViewModel = viewModel()
){
    CenterAlignedTopAppBar(
        title = {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(start = 8.dp)
            ) {
                Text(
                    text = stringResource(R.string.material_go),
                    style = MaterialTheme.typography.titleLarge,
                )
                Spacer(modifier = Modifier.weight(1f))
                AddButton(
                    onClick = {toDoViewModel.changeDialogVisibility()},
                )
            }
        }
    )
}