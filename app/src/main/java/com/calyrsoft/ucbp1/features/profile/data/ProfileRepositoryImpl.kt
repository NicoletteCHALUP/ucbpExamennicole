package com.calyrsoft.ucbp1.features.profile.data

import com.calyrsoft.ucbp1.features.profile.domain.model.Profile
import com.calyrsoft.ucbp1.features.profile.domain.repository.ProfileRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ProfileRepositoryImpl : ProfileRepository {
    override fun getProfile(): Flow<Result<Profile>> = flow {
        // Simulamos datos de perfil por ahora
        val avatarUrls = listOf(
                "http://googleusercontent.com/image_collection/image_retrieval/10682439033627412405_0", // Gatito 1
                "http://googleusercontent.com/image_collection/image_retrieval/10682439033627412405_1", // Gatito 2
                "http://googleusercontent.com/image_collection/image_retrieval/10682439033627412405_2", // Gatito 3
                "http://googleusercontent.com/image_collection/image_retrieval/10682439033627412405_3", // Gatito 4
                "http://googleusercontent.com/image_collection/image_retrieval/10682439033627412405_4"  // Gatito 5

        )
        val profile = Profile(
            id = "user_123",
            name = "Usuario Demo",
            email = "usuario@ejemplo.com",
            avatarUrl =  avatarUrls.random(),

        )
        emit(Result.success(profile))
    }
}