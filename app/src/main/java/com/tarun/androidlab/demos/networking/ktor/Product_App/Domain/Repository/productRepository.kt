package com.tarun.androidlab.demos.networking.ktor.Product_App.Domain.Repository

import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.DTO.ProductDTO

interface productRepository {

    suspend fun getAllProducts(): List<ProductDTO>

    suspend fun getProductById(id: Int): ProductDTO
}