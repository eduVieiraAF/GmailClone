package com.example.gmailclone.model

import com.example.gmailclone.R

val mailList = listOf(
    MailData(
        mailID = 1,
        userName = "Christy",
        subject = "Weekly Android News",
        body = "Hello, we have got exciting addition  to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailID = 2,
        userName = "Agatha",
        subject = "Job Application",
        body = "This is regarding a job opportunity I found on your website.",
        timeStamp = "20:10"
    ),
    MailData(
        mailID = 3,
        userName = "Cecilia",
        subject = "Flutter News",
        body = "Hello Cecilia we have got exciting addition  to the Flutter api",
        timeStamp = "20:10"
    ),
    MailData(
        mailID = 4,
        userName = "Angelo",
        subject = "Email regarding job opportunity",
        body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timeStamp = "21:10"
    ),
    MailData(
        mailID = 5,
        userName = "Sam",
        subject = "New Event has been created",
        body = "A new event has been added to your dashboard go check it out",
        timeStamp = "20:10"
    ),
    MailData(
        mailID = 6,
        userName = "Medium",
        subject = "JetPack compose for beginners",
        body = "This article will teach you all the basics of jetpack compose.",
        timeStamp = "20:10"
    ),
    MailData(
        mailID = 7,
        userName = "Netflix",
        subject = "A new Device is using your account",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        mailID = 8,
        userName = "Collins",
        subject = "A request for partnership",
        body = "This is a follow up email about the partnership request",
        timeStamp = "20:50"
    ),
    MailData(
        mailID = 9,
        userName = "Amazon",
        subject = "Your account has been created",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        mailID = 10,
        userName = "Jobs",
        subject = "New opportunity that suits you",
        body = "We have an opening that suits your profile kindly check it out and indicate your interest",
        timeStamp = "20:10"
    )
)

val accountList = listOf(
    Account(icon = R.drawable.gmail, userName = "Edu", email = "edu@gmail.com", unreadEmails = 70),
    Account(userName = "Edu #2", email = "edu2@gmail.com", unreadEmails = 34),
    Account(userName = "Edu #3", email = "edu3@gmail.com", unreadEmails = 25),
    Account( icon = R.drawable.gmail, userName = "Support", email = "support@gmail.com", unreadEmails = 61),
)