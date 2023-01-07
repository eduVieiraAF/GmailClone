package com.example.gmailclone.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.DrawerMenuData


@Composable
fun GmailDrawerMenu() {
    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Divider,
        DrawerMenuData.Header1,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Scheduled,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.Spam,
        DrawerMenuData.Trash,
        DrawerMenuData.Header2,
        DrawerMenuData.Calendar,
        DrawerMenuData.Divider,
        DrawerMenuData.Help,
        DrawerMenuData.Settings
    )

    Column {
        Text(
            text = "Gmail",
            color = Color.Red,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp, bottom = 10.dp),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun DefaultView() {
    GmailDrawerMenu()
}