package android.coderrrk.self_employedservice.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//вставляем запрос и преобразовываем в Gson
object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.hh.ru/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: ApiService by lazy{
        retrofit.create(ApiService::class.java)
    }
}