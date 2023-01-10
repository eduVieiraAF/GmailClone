package com.example.gmailclone.model

data class MailData(
    val mailID: Int,
    val userName: String,
    val subject: String,
    val body: String,
    val timeStamp: String = ""
)
