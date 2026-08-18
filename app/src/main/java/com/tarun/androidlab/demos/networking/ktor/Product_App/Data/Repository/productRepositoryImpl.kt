package com.tarun.androidlab.demos.networking.ktor.Product_App.Data.Repository

import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.DTO.ProductDTO
import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.Remote.productApiService
import com.tarun.androidlab.demos.networking.ktor.Product_App.Domain.Repository.productRepository

class productRepositoryImpl(private val apiService: productApiService): productRepository {

    override suspend fun getAllProducts(): List<ProductDTO> {

        return apiService.getAllProducts().products
    }

    override suspend fun getProductById(id: Int): ProductDTO {

        return apiService.getProductById(id)
    }

}