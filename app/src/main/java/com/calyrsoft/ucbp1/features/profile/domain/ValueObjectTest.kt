package com.calyrsoft.ucbp1.features.profile.domain.model

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import java.lang.IllegalArgumentException

class ValueObjectTest {

    // --- Pruebas para NameVO ---
    @Test
    fun `NameVO accepts valid name`() {
        val validName = "Jose Perez"
        val nameVO = NameVO(validName)
        assertEquals(validName, nameVO.value)
    }

    @Test
    fun `NameVO throws exception for short name`() {
        assertThrows(IllegalArgumentException::class.java) {
            NameVO("ab") // Menos de 3 caracteres
        }
    }

    // --- Pruebas para EmailVO ---
    @Test
    fun `EmailVO accepts valid email format`() {
        val validEmail = "user.test@calyrsoft.com"
        val emailVO = EmailVO(validEmail)
        assertEquals(validEmail, emailVO.value)
    }

    @Test
    fun `EmailVO throws exception for invalid email format`() {
        assertThrows(IllegalArgumentException::class.java) {
            EmailVO("invalid-email-no-at.com")
        }
    }

    // --- Pruebas para PhoneVO ---
    @Test
    fun `PhoneVO accepts 8 digit number`() {
        val validPhone = "70712345"
        val phoneVO = PhoneVO(validPhone)
        assertEquals(validPhone, phoneVO.value)
    }

    @Test
    fun `PhoneVO throws exception for non 8 digit number`() {
        assertThrows(IllegalArgumentException::class.java) {
            PhoneVO("1234567") // Menos de 8 dígitos
        }
    }
}