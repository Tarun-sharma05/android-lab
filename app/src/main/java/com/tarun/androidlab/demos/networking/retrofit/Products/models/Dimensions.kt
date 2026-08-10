package com.tarun.androidlab.demos.networking.retrofit.Products.models

import kotlinx.serialization.Serializable

@Serializable
data class Dimensions(
    val depth: Double,
    val height: Double,
    val width: Double
)