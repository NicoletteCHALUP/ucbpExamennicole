package com.calyrsoft.ucbp1.features.dollar.domain.model

data class DollarModel(
    val dollarOfficial: String? = null,
    val dollarParallel: String? = null,
    val dollarUsdt: String? = null,
    val dollarUsdc: String? = null,
    val timestamp: Long = 0L
)
