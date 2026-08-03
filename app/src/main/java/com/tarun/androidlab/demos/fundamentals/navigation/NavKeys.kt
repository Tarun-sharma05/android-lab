package com.tarun.androidlab.demos.fundamentals.navigation

import kotlinx.serialization.Serializable


data object Home
data object Product

//Networking
//Retrofit
//MarsPhotsApp
@Serializable
data object MarsPhotos
@Serializable
data class MarsDetail(val id: String, val url: String)