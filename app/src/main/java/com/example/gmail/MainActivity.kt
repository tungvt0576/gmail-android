package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var emailAdapter: EmailAdapter
    private var emailList = ArrayList<EmailModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tạo dữ liệu giả
        generateFakeData()

        listView = findViewById(R.id.listView)
        emailAdapter = EmailAdapter(emailList)
        listView.adapter = emailAdapter
    }

    private fun generateFakeData() {
        emailList.add(EmailModel("LiamSmith", "Project status update", "avatar15", "9:30 AM", true))
        emailList.add(EmailModel("EmmaDavis", "Team meeting agenda", "avatar16", "10:45 AM", false))
        emailList.add(EmailModel("NoahJohnson", "Feedback on the presentation", "avatar17", "Yesterday", true))
        emailList.add(EmailModel("OliviaWilson", "Client meeting follow-up", "avatar18", "2 days ago", false))
        emailList.add(EmailModel("WilliamBrown", "New feature discussion", "avatar19", "12:00 PM", true))
        emailList.add(EmailModel("SophieGarcia", "Weekly progress report", "avatar20", "9:15 AM", true))
        emailList.add(EmailModel("LiamMartinez", "Team lunch plans", "avatar21", "11:30 AM", false))
        emailList.add(EmailModel("AvaAnderson", "Customer feedback summary", "avatar22", "Yesterday", true))
        emailList.add(EmailModel("OliverLopez", "Task assignment update", "avatar23", "2 days ago", false))
        emailList.add(EmailModel("EmmaHarris", "Company news and updates", "avatar24", "10:30 AM", true))

    }
}