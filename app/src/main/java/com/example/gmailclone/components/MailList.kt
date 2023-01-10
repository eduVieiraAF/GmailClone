package com.example.gmailclone.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.model.MailData
import com.example.gmailclone.ui.theme.TRVWhite

@Composable
fun MailList(paddingValues: PaddingValues) {

}

@Composable
fun MailItem(mailData: MailData, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 2.dp, bottom = 8.dp)
    ) {
        Card(
            modifier = modifier
                .padding(end = 8.dp, start = 4.dp)
                .size(40.dp)
                .border(1.dp, color = Color.LightGray, shape = CircleShape)
                .clip(CircleShape),
            backgroundColor = TRVWhite,
            elevation = 8.dp
        ) {
            Text(
                text = mailData.userName[0].toString(),
                textAlign = TextAlign.Center,
                fontSize = 22.sp,
                modifier = Modifier.padding(8.dp)
            )
        }

        Column(
            modifier
                .padding(8.dp)
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