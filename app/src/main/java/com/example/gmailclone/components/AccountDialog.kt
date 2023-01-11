package com.example.gmailclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.gmailclone.R
import com.example.gmailclone.model.mailList
import com.example.gmailclone.ui.theme.TRVWhite

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI()
    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier) {
    Card() {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {
            Row(
                modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                        .padding(end = 20.dp)
                )
            }

            Divider()

            Row(
                modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gmail),
                    contentDescription = "",
                    modifier
                        .size(40.dp)
                        .background(color = TRVWhite)
                )
                
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 40.dp, bottom = 16.dp)
                ) {
                    Text(text = "Edu's Gmail", fontWeight = FontWeight.SemiBold)
                    Text(text = "edu@gmail.com")
                }
                    Text(
                        //text = mailList.size.toString(),
                        text = "99+",
                        modifier.padding(end = 16.dp)
                    )
            }
            
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
                
                //Spacer(modifier = Modifier.width(10.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowDialog() {
    AccountsDialogUI()
}