package android.coderrrk.self_employedservice.domain.retrofitusecase

import retrofit2.Response

interface Repository {

    suspend fun getDataRetro(): Response<Jobs>

}