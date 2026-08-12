package com.tarun.androidlab.demos.networking.ktor.Product_App.Data.DTO

data class Review(
    val comment: String,
    val date: String,
    val rating: Int,
    val reviewerEmail: String,
    val reviewerName: String
)