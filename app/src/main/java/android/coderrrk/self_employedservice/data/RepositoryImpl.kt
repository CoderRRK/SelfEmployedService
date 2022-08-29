package android.coderrrk.self_employedservice.data

import android.coderrrk.self_employedservice.domain.retrofitusecase.Jobs
import android.coderrrk.self_employedservice.domain.retrofitusecase.Repository
import retrofit2.Response

class RepositoryImpl: Repository {

    //реализуем функцию интерфеса домейн слоя
    override suspend fun getListExchangeRates(): Response<Jobs> {
        return RetrofitInstance.api.getListExchangeRates()
    }

}