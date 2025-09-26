package com.calyrsoft.ucbp1.features.dollar.data.mapper

import com.calyrsoft.ucbp1.features.dollar.data.database.entity.DollarEntity
import com.calyrsoft.ucbp1.features.dollar.domain.model.DollarModel

// Entity -> Model
fun DollarEntity.toModel(): DollarModel {
    return DollarModel(
        dollarOfficial = dollarOfficial,
        dollarParallel = dollarParallel,
        dollarUsdt = dollarUsdt,   // ✅ Nuevo
        dollarUsdc = dollarUsdc,   // ✅ Nuevo
        timestamp = timestamp
    )
}

// Model -> Entity
fun DollarModel.toEntity(): DollarEntity {
    return DollarEntity(
        dollarOfficial = dollarOfficial,
        dollarParallel = dollarParallel,
        dollarUsdt = dollarUsdt,   // ✅ Nuevo
        dollarUsdc = dollarUsdc,   // ✅ Nuevo
        timestamp = if (timestamp == 0L) System.currentTimeMillis() else timestamp
    )
}
