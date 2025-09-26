package com.calyrsoft.ucbp1.features.dollar.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dollars")
data class DollarEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "dollar_official")
    var dollarOfficial: String? = null,

    @ColumnInfo(name = "dollar_parallel")
    var dollarParallel: String? = null,

    @ColumnInfo(name = "dollar_usdt")
    var dollarUsdt: String? = null,   // ✅ Nuevo campo

    @ColumnInfo(name = "dollar_usdc")
    var dollarUsdc: String? = null,   // ✅ Nuevo campo

    @ColumnInfo(name = "timestamp")
    var timestamp: Long = 0
)
