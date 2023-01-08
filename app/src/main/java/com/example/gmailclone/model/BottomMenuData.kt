package com.example.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Android
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoChat
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String
) {
    object Mail : BottomMenuData(icon = Icons.Outlined.Mail, title = "Mail")
    object Meet : BottomMenuData(icon = Icons.Outlined.VideoChat, title = "Meet")
    object Edu : BottomMenuData(icon = Icons.Outlined.Android, title = "Edu")
    object Add : BottomMenuData(icon = Icons.Outlined.Add, title = "Add")
}
