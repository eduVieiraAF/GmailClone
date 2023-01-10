package com.example.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.example.gmailclone.ui.theme.TRVWhite

@Composable
fun GmailFAB(scrollState: ScrollState) {

    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(
            text = { Text(text = "Compose", fontSize = 16.sp) },
            onClick = { /*TODO*/ },
            icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "") },
            backgroundColor = TRVWhite
        )
    } else {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = TRVWhite
        ) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "")
        }
    }
}
