package com.example.expensetracker

data class TransactionItem(
    val amount: String,
    val category: String,
    val date: String,
    val merchant: String
)
