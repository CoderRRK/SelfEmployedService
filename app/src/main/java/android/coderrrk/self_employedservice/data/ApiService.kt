package android.coderrrk.self_employedservice.data

import android.coderrrk.self_employedservice.domain.Jobs
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("vacancies")
    suspend fun getListExchangeRates(): Response<Jobs>

}