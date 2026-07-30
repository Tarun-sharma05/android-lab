package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import android.nfc.Tag
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.visible
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.tarun.androidlab.demos.fundamentals.lists.EachCard
import com.tarun.androidlab.demos.fundamentals.lists.Product

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  MarsPhotosUI(modifier: Modifier, viewModel: MarsViewModel) {

     val getPhotosState = viewModel.marsUiState


        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopAppBar(title = { Text("Mars Photos", textAlign = TextAlign.Center) }) }
        ) { paddingValues ->

            PullToRefreshBox(
                isRefreshing = viewModel.isRefreshing,
                onRefresh = {viewModel.getMarsPhotos()},
                modifier = Modifier.padding(paddingValues).fillMaxSize()
            ) {
            when (getPhotosState) {
                is MarsUiState.Loading -> {
                    Box(
                        modifier = modifier.fillMaxSize().padding(8.dp)
                            .verticalScroll(rememberScrollState()),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }

                is MarsUiState.Error -> {
//            Text(text = "Failed to load photos")
                    Box(
                        modifier = modifier.fillMaxSize().padding(8.dp)
                            .verticalScroll(rememberScrollState()),
                        contentAlignment = Alignment.Center
                    ) {
                        Log.d("errors", "Error: ${getPhotosState.message}")
                        Text(text = "Error: ${getPhotosState.message}")
                    }
                }


                is MarsUiState.Success -> {
//            Log.d("Products", "$")
//            LazyColumn(modifier = modifier) {

                    LazyVerticalStaggeredGrid(
                        modifier = Modifier.padding().fillMaxSize(),
                        columns = StaggeredGridCells.Fixed(2),
                        verticalItemSpacing = 4.dp,
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                    ) {
                        items(getPhotosState.photos) { photo ->
                            Log.d("Products", "$photo")

                            EachCard(photo = photo)


                        }
                    }
                }
            }


        }
    }

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


@Composable
fun EachCard(photo: MarsDTOItem, modifier: Modifier = Modifier) {

    Card(
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                    model = photo.img_src,
                    contentDescription = "Mars Photo",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                )
        }
    }
}