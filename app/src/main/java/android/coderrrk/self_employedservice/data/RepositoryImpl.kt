package android.coderrrk.self_employedservice.data

import android.coderrrk.self_employedservice.domain.Jobs
import android.coderrrk.self_employedservice.domain.Repository
import retrofit2.Response

class RepositoryImpl: Repository {

    override suspend fun getListExchangeRates(): Response<Jobs> {
        return RetrofitInstance.api.getListExchangeRates()
    }

}