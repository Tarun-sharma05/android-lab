package com.tarun.androidlab.demos.networking.ktor.Product_App.Data.Remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

object ktorClient{

         val client = HttpClient(Android){
             install(ContentNegotiation) {
                 json(
                     Json { ignoreUnknownKeys = true }
                 )
             }
 }

//    const val RECIPE = "$BASE_URL/products"
}