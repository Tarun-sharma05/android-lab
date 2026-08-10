package com.tarun.androidlab.demos.networking.retrofit.Products.models

import kotlinx.serialization.Serializable

@Serializable
data class ProductListDemo(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)