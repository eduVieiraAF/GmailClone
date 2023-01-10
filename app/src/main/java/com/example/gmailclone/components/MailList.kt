package com.example.gmailclone.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.model.MailData
import com.example.gmailclone.model.mailList
import com.example.gmailclone.ui.theme.TRVWhite

@Composable
fun MailList(paddingValues: PaddingValues) {
    Box(modifier = Modifier.padding(paddingValues = paddingValues)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            items(mailList) { mailData ->
                MailItem(mailData = mailData)

            }
        }
    }
}

@Composable
fun MailItem(mailData: MailData, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp)
    ) {
        Card(
            modifier = modifier
                .padding(end = 8.dp, start = 8.dp)
                .size(50.dp)
                .border(1.dp, color = Color.LightGray, shape = CircleShape)
                .align(CenterVertically)
                .clip(CircleShape),
            backgroundColor = TRVWhite,
        ) {
            Text(
                text = mailData.userName[0].toString(),
                textAlign = TextAlign.Center,
                fontSize = 26.sp,
                modifier = Modifier.padding(8.dp)
            )
        }

        Column(
            modifier
                .padding(12.dp)
                .weight(2.0f)

        ) {
            Text(
                text = mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = mailData.body,
                fontSize = 14.sp,
            )
        }

        Column {
            Text(text = mailData.timeStamp)
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 16.dp)
                    .size(50.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.StarOutline,
                    contentDescription = ""
                )
            }
        }
    }

    Divider()
}

@Preview(showBackground = true)
@Composable
fun Display() {
    MailItem(
        mailData = MailData(
            mailID = 7,
            subject = "Email subject",
            body = "Email body should contain a body",
            timeStamp = "11:11",
            userName = "User"
        )
    )
}