package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil3.network.HttpException
import com.tarun.androidlab.demos.fundamentals.lists.Photos
import kotlinx.coroutines.launch
import okio.IOException

sealed interface MarsUiState{
    data class Success(val photos: String): MarsUiState

    object  Error : MarsUiState

    object Loading: MarsUiState
}


class MarsViewModel: ViewModel(){

    var marsUiState : MarsUiState by mutableListOf(MarsUiState.Loading)

      private set

    init {
        getMarsPhotos()
    }

    fun getMarsPhotos(){
        viewModelScope.launch {
            marsUiState = MarsUiState.Loading

            marsUiState =try {
                val result = MarsApi.retrofitService.getPhotos()
                MarsUiState.Success ("Success ${result.size} Mars Photos retrieved")
            }catch (e: IOException){
                MarsUiState.Error
            }catch (e: HttpException){
                MarsUiState.Error
            }

        }
    }

}