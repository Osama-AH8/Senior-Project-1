package com.example.expensetracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddTransactionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_transaction)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val etAmount = findViewById<EditText>(R.id.etAmount)
        val etMerchant = findViewById<EditText>(R.id.etMerchant)
        val etDate = findViewById<EditText>(R.id.etDate)
        val spCategory = findViewById<Spinner>(R.id.spCategory)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnBack.setOnClickListener {
            finish()
        }

        btnSave.setOnClickListener {
            // فقط رسالة بسيطة – البيانات ما تتخزن
            Toast.makeText(this, "Transaction saved (fake)", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}
