package com.android.materialcounter.components.todocard

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.BookmarkAdded
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CardIcons(
    clicked: Boolean
){
    Icon(
        imageVector = if(clicked) Icons.Rounded.BookmarkAdded else Icons.Rounded.Bookmark,
        contentDescription = "TodoIcon",
        tint = if(clicked)MaterialTheme.colorScheme.secondary else MaterialTheme.colorScheme.error,
    )
}