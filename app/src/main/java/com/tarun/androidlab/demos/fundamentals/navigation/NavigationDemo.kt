package com.tarun.androidlab.demos.fundamentals.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.MarsPhotosUI
import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.MarsViewModel
import com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp.SingleMarsPhotoUI


@Composable
fun NavExample(modifier: Modifier = Modifier) {

    val backStack = remember{ mutableStateListOf<Any>(MarsPhotos) }

    NavDisplay(
        backStack = backStack,
        onBack = {backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Home>{
                  HomeScreenUI(
                      onNavigatToDetails = { backStack.add(Product)}
                  )
            }

            entry<Product>{
                  DetailsScreenUI(
                      onBack = {backStack.removeLastOrNull()}
                  )
            }

            entry<MarsPhotos>{
                val marsViewModel: MarsViewModel = viewModel()
                MarsPhotosUI(
                    modifier = Modifier,
                    viewModel = marsViewModel,
                    onPhotoClick = {photo ->
                        backStack.add(MarsDetail(id = photo.id, url = photo.img_src))
                    }
                )
            }

            entry<MarsDetail> { key ->
                SingleMarsPhotoUI(
                    url = key.url,
                    onBack = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}


@Composable
fun HomeScreenUI(  onNavigatToDetails: () -> Unit = {}, modifier1: Modifier = Modifier) {
     Column( Modifier.padding(12.dp).fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Top
     ){
         Button(onClick = onNavigatToDetails ,
             modifier = Modifier.padding(top = 12.dp),

             ){
             Text("Details Screen")

         }
     }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreenUI( onBack:()-> Unit,modifier: Modifier = Modifier) {

          Scaffold(modifier = Modifier.fillMaxSize(),
              topBar = {TopAppBar(
                  navigationIcon = {
                      Box{
                          IconButton(onClick = onBack) {
                               Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null)
                         }
                      }
                  },
                  title = {Text("")}
              )}
          ) {innerPadding ->

              Column(modifier= Modifier.fillMaxSize().padding(),
                  horizontalAlignment = Alignment.CenterHorizontally,
                  verticalArrangement = Arrangement.Center) {

                  Text("Welcome to Details Screen!")
          }


      }
}