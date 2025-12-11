package com.example.expensetracker

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TransactionDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_details)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val tvAmount = findViewById<TextView>(R.id.tvAmount)
        val tvCategory = findViewById<TextView>(R.id.tvCategory)
        val tvDate = findViewById<TextView>(R.id.tvDate)
        val tvMerchant = findViewById<TextView>(R.id.tvMerchant)

        val amount = intent.getStringExtra("amount")
        val category = intent.getStringExtra("category")
        val date = intent.getStringExtra("date")
        val merchant = intent.getStringExtra("merchant")

        tvAmount.text = amount
        tvCategory.text = "Category: $category"
        tvDate.text = "Date: $date"
        tvMerchant.text = "Merchant: $merchant"

        btnBack.setOnClickListener {
            finish()
        }
    }
}
