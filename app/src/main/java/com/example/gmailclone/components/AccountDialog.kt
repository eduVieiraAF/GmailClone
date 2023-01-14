package com.example.gmailclone.components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.gmailclone.R
import com.example.gmailclone.model.Account
import com.example.gmailclone.model.accountList
import com.example.gmailclone.ui.theme.Red700
import com.example.gmailclone.ui.theme.TRVWhite

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(
        onDismissRequest = { openDialog.value = false },
        properties = DialogProperties(
            dismissOnClickOutside = false,
            dismissOnBackPress = false
        )
    ) {
        AccountsDialogUI(openDialog = openDialog)
    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>) {
    Card() {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { openDialog.value = false }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                        .padding(end = 30.dp)
                )
            }

            Divider(modifier.padding(top = 8.dp, bottom = 8.dp))

            AccountItem(account = accountList[0])

            Row(
                modifier
                    .fillMaxWidth()
                    .align(CenterHorizontally),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Text(
                        text = "Google Account",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }

            Divider(modifier.padding(top = 8.dp, bottom = 8.dp))

            Column {
                AccountItem(account = accountList[1])
                AccountItem(account = accountList[2])
                AccountItem(account = accountList[3])
            }

            AddAccount(
                icon = Icons.Outlined.ManageAccounts,
                title = "Manage Accounts"
            )
            AddAccount(
                icon = Icons.Default.PersonAddAlt,
                title = "Add Another Account"
            )

            Divider(modifier.padding(top = 8.dp, bottom = 8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Privacy Policy")
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .size(5.dp),
                    shape = CircleShape,
                    backgroundColor = Red700
                ) {}
                Text(text = "Terms of Service")
            }
        }
    }
}

@Composable
fun AccountItem(account: Account) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, bottom = 16.dp, end = 8.dp)
    ) {

        if (account.icon != null) {
            Image(
                painter = painterResource(id = R.drawable.gmail),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .background(color = TRVWhite)
                    .padding(top = 4.dp)
            )
        } else {
            Card(
                modifier = Modifier
                    .padding(end = 8.dp, start = 8.dp)
                    .size(50.dp)
                    .border(1.dp, color = Color.LightGray, shape = CircleShape)
                    .align(Alignment.CenterVertically)
                    .clip(CircleShape),
                backgroundColor = TRVWhite,
            ) {
                Text(
                    text = account.userName[0].toString(),
                    fontSize = 26.sp,
                    modifier = Modifier.padding(8.dp),
                    textAlign = TextAlign.Center
                )
            }
        }

        Column(
            modifier = Modifier
                .weight(2.0f)
                .padding(start = 8.dp, bottom = 16.dp, end = 8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = account.userName,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
            Text(text = account.email, textAlign = TextAlign.Center)
        }
        Text(
            //text = mailList.size.toString(),
            text = "${account.unreadEmails}",
            modifier = Modifier.padding(end = 16.dp, top = 8.dp)
        )
    }
}

@Composable
fun AddAccount(icon: ImageVector, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "",
            modifier = Modifier
                .padding(start = 12.dp, top = 8.dp, bottom = 8.dp)
        )

        Text(
            text = title,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(start = 12.dp, top = 8.dp, bottom = 8.dp)
        )
    }


}

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun ShowDialog() {
    val openDialog = true
    AccountsDialogUI(openDialog = mutableStateOf(false))
}