package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model.MarsDTOItem
import kotlinx.coroutines.launch

sealed interface MarsUiState{
    data class Success(val photos: List<MarsDTOItem>): MarsUiState

    object  Error : MarsUiState

    object Loading: MarsUiState
}

class MarsViewModel : ViewModel(){

    var marsUiState : MarsUiState by mutableStateOf(MarsUiState.Loading)

      private set

    init {
        getMarsPhotos()
    }

    fun getMarsPhotos(){
        viewModelScope.launch {

            MarsPhotosRepository().getMarsPhotos().collect { state ->
                marsUiState = when(state){
                    is State.Loading -> MarsUiState.Loading
                    is State.Success -> {
                       val body = state.data.body() ?: emptyList()
                        MarsUiState.Success(body)
                    }
                    is State.Error -> MarsUiState.Error
                }
            }

        }
    }

}