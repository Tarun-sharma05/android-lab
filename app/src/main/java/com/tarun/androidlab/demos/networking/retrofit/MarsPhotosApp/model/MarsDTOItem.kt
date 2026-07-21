package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model

import kotlinx.serialization.Serializable

@Serializable
data class MarsDTOItem(
    val id: String,
    val img_src: String
)