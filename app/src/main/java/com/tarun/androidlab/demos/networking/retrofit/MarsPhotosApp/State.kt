package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

sealed class State<out T>{
    object Loading: State<Nothing>()
    data class Success<T>(val data: T) : State<T>()
    data class Error(val message: String): State<Nothing>()

}