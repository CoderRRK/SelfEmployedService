package android.coderrrk.self_employedservice.domain

import retrofit2.Response

interface Repository {

    suspend fun getListExchangeRates(): Response<Jobs>

}