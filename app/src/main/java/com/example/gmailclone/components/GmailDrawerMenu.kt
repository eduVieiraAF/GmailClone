package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.DrawerMenuData
import com.example.gmailclone.ui.theme.Red200

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {
    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
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
        DrawerMenuData.Settings,
        DrawerMenuData.Divider,
        DrawerMenuData.Edu
    )

    Column(Modifier.verticalScroll(scrollState)) {
        Text(
            text = "Gmail",
            color = Red200,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp, bottom = 10.dp),
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        )

        menuList.forEach {
            when {
                it.isDivider -> {
                    Divider(
                        modifier = Modifier.padding(
                            top = 12.dp,
                            bottom = 12.dp
                        )
                    )
                }

                it.isHeader -> {
                    Text(
                        text = it.title!!,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(
                            top = 12.dp,
                            bottom = 12.dp,
                            start = 20.dp
                        )
                    )
                }

                else -> {
                    MailDrawerItem(item = it)
                }
            }
        }
    }
}

@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 10.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier
                .weight(0.5f)
        )

        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultView() {
    val scrollState = rememberScrollState()
    GmailDrawerMenu(scrollState)
}