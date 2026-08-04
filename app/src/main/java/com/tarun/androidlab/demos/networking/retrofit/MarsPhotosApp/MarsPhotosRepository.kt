package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model.MarsDTO
import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model.MarsDTOItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class MarsPhotosRepository{
    suspend fun getMarsPhotos(): Flow<State<Response<List<MarsDTOItem>>>> = flow{
         emit(State.Loading)

          try {
              val response = ApiProvider.retrofitService.getPhotos()
              emit(State.Success(response))
          }
          catch (e: Exception){
              emit(State.Error(e.message.toString()))
          }
    }

}
