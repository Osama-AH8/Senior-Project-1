package com.example.expensetracker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TransactionsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transactions_list)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val recyclerView = findViewById<RecyclerView>(R.id.rvTransactions)

        btnBack.setOnClickListener {
            finish()
        }

        val list = listOf(
            TransactionItem("120 SAR", "Food", "2025-01-01", "KFC"),
            TransactionItem("80 SAR", "Groceries", "2025-01-05", "Carrefour"),
            TransactionItem("300 SAR", "Shopping", "2025-01-10", "Zara")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TransactionAdapter(list) { item ->
            val i = Intent(this, TransactionDetailsActivity::class.java)
            i.putExtra("amount", item.amount)
            i.putExtra("category", item.category)
            i.putExtra("date", item.date)
            i.putExtra("merchant", item.merchant)
            startActivity(i)
        }
    }
}
