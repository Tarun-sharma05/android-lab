package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.visible
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.model.MarsDTOItem
import androidx.compose.foundation.lazy.items

@Composable
fun  MarsPhotosUI(modifier: Modifier, viewModel: MarsViewModel) {

     val getPhotosState = viewModel.marsUiState

    when(getPhotosState){
        is MarsUiState.Loading -> {
            CircularProgressIndicator()
        }

        is MarsUiState.Error -> {
            Text(text = "Failed to load photos")
        }

        is MarsUiState.Success -> {
            LazyColumn(modifier = Modifier) {
                items(getPhotosState.photos) {photo ->
                    MarsPhotosCard(photo = photo)
                }
            }
        }
    }

//    Card() { }



}

@Composable
fun MarsPhotosCard(modifier: Modifier = Modifier, photo: MarsDTOItem){
    Card(modifier = Modifier) {
        AsyncImage(
            model = photo.img_src,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(200.dp)
        )
    }
}