package com.example.expensetracker

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ReportsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reports)

        val back = findViewById<ImageView>(R.id.btnBack)
        back.setOnClickListener {
            finish()
        }
    }
}
