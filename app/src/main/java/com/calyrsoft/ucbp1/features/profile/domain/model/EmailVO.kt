package com.calyrsoft.ucbp1.features.profile.domain.model

data class EmailVO(val value: String) {
    init {
        // Regla: Validación de formato de email simple.
        require(value.matches(Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\$"))) {
            "El formato del correo electrónico es inválido."
        }
    }
}