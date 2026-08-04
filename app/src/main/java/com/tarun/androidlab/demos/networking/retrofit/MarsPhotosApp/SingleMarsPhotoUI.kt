package com.tarun.androidlab.demos.networking.retrofit.MarsPhotosApp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.SubcomposeAsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingleMarsPhotoUI(modifier: Modifier = Modifier, onBack: () -> Unit, url: String, ) {

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = { IconButton(onClick = onBack){
                    Icon(
                        Icons.AutoMirrored.Default.ArrowBack,
                        contentDescription = null,
                    )
                }
            },
                title = { Text(text = "Detail screen") }
            )
        }
    ) {paddingValues ->

                      Column(
                          modifier = Modifier.padding(paddingValues).fillMaxSize(),
                          verticalArrangement = Arrangement.Center,
                          horizontalAlignment = Alignment.CenterHorizontally
                      ) {

                          SubcomposeAsyncImage(
                              model = url,
                              contentDescription = "Mars Photo Detail",
                              modifier = Modifier.fillMaxWidth(),
                              loading = {
                                  Box(
                                      modifier = Modifier.fillMaxSize(),
                                      contentAlignment = Alignment.Center,
                                  ){
                                      CircularProgressIndicator()
                                  }
                              },
                              error = {
                                  Text("Failed to load image. Please try Again")
                              }
                          )
                      }
        }

    }
