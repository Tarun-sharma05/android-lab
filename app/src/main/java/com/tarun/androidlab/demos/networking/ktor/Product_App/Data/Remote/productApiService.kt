package com.tarun.androidlab.demos.networking.ktor.Product_App.Data.Remote

import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.DTO.ProductDTO
import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.DTO.ProductResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class productApiService(private val client: HttpClient) {

    suspend fun getAllProducts(): ProductResponse{
        return client.get(urlString = "${BASE_URL}products").body()
    }

    suspend fun getProductById(id: Int): ProductDTO {
        return client.get(urlString = "${BASE_URL}products/$id").body()
    }

}