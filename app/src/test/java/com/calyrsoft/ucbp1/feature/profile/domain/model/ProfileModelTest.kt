package com.calyrsoft.ucbp1.feature.profile.domain.model

import com.calyrsoft.ucbp1.features.profile.domain.model.Profile
import org.junit.Assert
import org.junit.Test

class ProfileModelTest {

    @Test
    fun `Profile se construye correctamente con value objects válidos`() {
        val profile = Profile(
            id = ProfileId("user_123"),
            name = ProfileName("Juan Perez"),
            email = ProfileEmail("juan@ucb.edu.bo"),
            avatarUrl = ProfileAvatarUrl("https://img.com/avatar.jpg")
        )

        Assert.assertEquals("user_123", profile.id.value)
        Assert.assertEquals("Juan Perez", profile.name.value)
        Assert.assertEquals("juan@ucb.edu.bo", profile.email.value)
        Assert.assertEquals("https://img.com/avatar.jpg", profile.avatarUrl.value)
    }
}