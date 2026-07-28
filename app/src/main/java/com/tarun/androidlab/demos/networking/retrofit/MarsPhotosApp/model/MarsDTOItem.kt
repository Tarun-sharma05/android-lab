package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsDTOItem(
    val id: String,
    @SerialName("img_src") val img_src: String
)