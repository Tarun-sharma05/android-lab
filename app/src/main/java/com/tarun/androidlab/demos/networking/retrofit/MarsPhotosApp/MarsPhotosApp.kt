package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model.MarsDTO
import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model.MarsDTOItem
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"


object ApiProvider{
        private val json = Json{ignoreUnknownKeys = true}
       val retrofitService: ApiService by lazy {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()
            .create(ApiService::class.java)
    }
}


interface ApiService {
    @GET("photos")
   suspend fun getPhotos(): Response<List<MarsDTOItem>>
}

