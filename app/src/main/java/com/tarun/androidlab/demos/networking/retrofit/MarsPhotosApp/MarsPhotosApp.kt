package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import retrofit2.Retrofit

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"


object ApiProvide {
    fun retrofit() = Retrofit.Builder().baseUrl(BASE_URL).client(okhttp3.OkHttpClient.Builder().build())
        .addConverterFactory()
}