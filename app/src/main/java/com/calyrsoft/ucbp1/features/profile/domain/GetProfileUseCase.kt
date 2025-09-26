package com.calyrsoft.ucbp1.features.profile.domain

import com.calyrsoft.ucbp1.features.profile.domain.model.ProfileModel
import com.calyrsoft.ucbp1.features.profile.domain.repository.IProfileRepository

class GetProfileUseCase(private val repository: IProfileRepository) {
    suspend operator fun invoke(): Result<ProfileModel> {
        return repository.getProfile()
    }
}