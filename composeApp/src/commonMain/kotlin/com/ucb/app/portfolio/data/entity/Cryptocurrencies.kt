package com.ucb.app.portfolio.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("crypto_currencies")
data class Cryptocurrencies(
    val symbol: String,
    val name: String,
    val description: String?  = null
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
