package com.tarun.androidlab.demos.networking.ktor.Product_App.Data.DTO

data class ProductResponse(
    val limit: Int,
    val products: List<ProductDTO>,
    val skip: Int,
    val total: Int
)