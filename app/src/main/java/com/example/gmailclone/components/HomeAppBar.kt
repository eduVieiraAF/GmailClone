package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone.GmailApp
import com.example.gmailclone.R
import com.example.gmailclone.ui.theme.GmailCloneTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    Box(
        modifier = Modifier
            .padding(10.dp)

    ) {
        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = 4.dp,
            modifier = Modifier
                .requiredHeight(50.dp)
                .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(20.dp))
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }) {
                    Icon(Icons.Default.Menu, "Menu")
                }

                Text(
                    textAlign = TextAlign.Justify,
                    text = "Search in emails",
                    modifier = Modifier
                        .weight(2.0f)
                        .padding(horizontal = 6.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.gmail),
                    contentDescription = "email icon",
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 8.dp)
                    //.clip(CircleShape)
                )
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    GmailCloneTheme { HomeAppBar(scaffoldState = scaffoldState, scope = coroutineScope) }
}