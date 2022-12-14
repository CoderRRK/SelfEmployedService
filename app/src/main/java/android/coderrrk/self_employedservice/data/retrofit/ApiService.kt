package android.coderrrk.self_employedservice.data.retrofit

import android.coderrrk.self_employedservice.domain.retrofitusecase.Jobs
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    //Запрос JSON
    @GET("vacancies")
    suspend fun getListDataRetro(): Response<Jobs>

}