package com.example.gmailclone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {
    object AllInboxes : DrawerMenuData(icon = Icons.Outlined.AllInbox, title = "All inboxes")
    object Primary : DrawerMenuData(icon = Icons.Outlined.Inbox, title = "Primary")
    object Social : DrawerMenuData(icon = Icons.Outlined.Person, title = "Social")
    object Starred : DrawerMenuData(icon = Icons.Outlined.Star, title = "Starred")
    object Snoozed : DrawerMenuData(icon = Icons.Outlined.Snooze, title = "Snoozed")
    object Important : DrawerMenuData(icon = Icons.Outlined.Info, title = "Important")
    object Sent : DrawerMenuData(icon = Icons.Outlined.Send, title = "Sent")
    object Scheduled : DrawerMenuData(icon = Icons.Outlined.ScheduleSend, title = "Scheduled")
    object Outbox : DrawerMenuData(icon = Icons.Outlined.Outbox, title = "Outbox")
    object Draft : DrawerMenuData(icon = Icons.Outlined.Drafts, title = "Draft")
    object AllMail : DrawerMenuData(icon = Icons.Outlined.Email, title = "All mail")
    object Spam : DrawerMenuData(icon = Icons.Outlined.Error, title = "Spam")
    object Trash : DrawerMenuData(icon = Icons.Outlined.Delete, title = "Trash")
    object Calendar : DrawerMenuData(icon = Icons.Outlined.CalendarToday, title = "Calendar")
    object Help : DrawerMenuData(icon = Icons.Outlined.Help, title = "Help")
    object Settings : DrawerMenuData(icon = Icons.Outlined.Settings, title = "Settings")
    object Divider : DrawerMenuData(isDivider = true)
    object Header1 : DrawerMenuData(isHeader = true, title = "All labels")
    object Header2 : DrawerMenuData(isHeader = true, title = "Apps")
}