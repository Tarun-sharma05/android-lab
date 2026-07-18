package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"


private val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(Json.asConverterFactory("Application/Json".toMediaType()))
        .build()


interface ApiService {
    @GET("photos")
    fun getPhotos(): String
}

object MarsApi{
    val retrofitService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}