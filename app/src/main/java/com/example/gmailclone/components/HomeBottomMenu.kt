package com.example.gmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone.model.BottomMenuData
import com.example.gmailclone.ui.theme.Red700
import com.example.gmailclone.ui.theme.TRVWhite

@Composable
fun HomeBottomMenu() {
    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet,
        BottomMenuData.Add,
        BottomMenuData.Edu
    )

    BottomNavigation(
        backgroundColor = TRVWhite,
        contentColor = Red700,
        elevation = 8.dp,
        //modifier = Modifier.border(width = 1.dp, color = Color.Gray)
    ) {
        items.forEach {
            BottomNavigationItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) },
                alwaysShowLabel = true,
            )
        }
    }
}


@Preview
@Composable
fun Preview() {
    HomeBottomMenu()
}