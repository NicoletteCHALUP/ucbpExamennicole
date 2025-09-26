package com.calyrsoft.ucbp1.features.profile.domain.model

data class NameVO(val value: String) {
    init {
        // Regla: No vacío y al menos 3 caracteres.
        require(value.isNotBlank() && value.length >= 3) {
            "El nombre debe tener al menos 3 caracteres y no puede estar vacío."
        }
    }
}