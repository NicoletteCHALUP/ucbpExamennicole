package com.calyrsoft.ucbp1.features.profile.domain.model

// Asumo que tu ProfileModel original podría tener estos campos, si no, agrégalos.
data class ProfileModel(
    val id: String,
    // Se reemplazan los String por los Value Objects
    val name: NameVO,
    val phone: PhoneVO,
    val email: EmailVO
)