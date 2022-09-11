package android.coderrrk.self_employedservice.data.retrofit

import android.coderrrk.self_employedservice.domain.retrofitusecase.Jobs
import android.coderrrk.self_employedservice.domain.retrofitusecase.Repository
import retrofit2.Response

class RepositoryImpl: Repository {

    //реализуем функцию интерфеса домейн слоя
    override suspend fun getDataRetro(): Response<Jobs> {
        return RetrofitInstance.api.getListDataRetro()
    }

}