package com.calyrsoft.ucbp1.features.profile.domain.model

data class PhoneVO(val value: String) {
    init {
        // Regla: Debe ser un número de 8 dígitos (típico en Bolivia).
        require(value.matches(Regex("^[0-9]{8}\$"))) {
            "El número de teléfono debe tener 8 dígitos numéricos."
        }
    }
}