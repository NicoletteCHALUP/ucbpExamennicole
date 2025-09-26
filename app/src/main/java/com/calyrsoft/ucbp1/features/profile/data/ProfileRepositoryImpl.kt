package com.calyrsoft.ucbp1.features.profile.data

import com.calyrsoft.ucbp1.features.profile.domain.model.Profile
import com.calyrsoft.ucbp1.features.profile.domain.model.value.*
import com.calyrsoft.ucbp1.features.profile.domain.repository.ProfileRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ProfileRepositoryImpl : ProfileRepository {
    override fun getProfile(): Flow<Result<Profile>> = flow {
        // Simulamos datos de perfil por ahora
        val avatarUrls = listOf(
            "https://images.unsplash.com/photo-1543852786-1cf6624b9987?w=500&q=80", // Gatito 1
            "https://images.unsplash.com/photo-1514815617415-c276b6e4093f?w=500&q=80", // Gatito 2
            "https://images.unsplash.com/photo-1577023307406-8d57866504a4?w=500&q=80", // Gatito 3
            "https://images.unsplash.com/photo-1560931557-f6558452cc9e?w=500&q=80", // Gatito 4
            "https://images.unsplash.com/photo-1518791841217-8f162f1e1131?w=500&q=80"  // Gatito 5
        )
        val profile = Profile(
            id = ProfileId("user_123"),
            name = ProfileName("Usuario Demo"),
            email = ProfileEmail("usuario@ejemplo.com"),
            avatarUrl = ProfileAvatarUrl(avatarUrls.random())
        )
        emit(Result.success(profile))
    }
}