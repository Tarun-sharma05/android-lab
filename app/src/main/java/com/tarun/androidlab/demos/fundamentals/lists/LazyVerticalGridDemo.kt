package com.tarun.androidlab.demos.fundamentals.lists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage

@Composable
fun LazyVerticalGridDemo(items: List<Fakedata>) {


    Column(
        Modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        LazyVerticalGrid(GridCells.Fixed(2)) {
            items(
                items = items,
                key = { item -> item.id }
            ) { item ->



            Card(modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.Black)
                ) {
                Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Column(Modifier.background(color = Color.Blue),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = item.text,
                             color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.background(color = Color.Red),
                          verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                    AsyncImage(
                        model = item.image,
                        contentDescription = null,
                        Modifier.size(200.dp)
                    )
                    }


                }
            }
        }
        }
    }

}



fun sampleData(): List<Fakedata>{
        return listOf(
            Fakedata(
               id=1,
               text = "Text1",
               image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 2,
                text = "Text 2",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 3,
                text = "Text 3",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 4,
                text = "Text 4",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 5,
                text = "Text 5",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 6,
                text = "Text 6",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 7,
                text = "Text 7",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 8,
                text = "Text 8",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 9,
                text = "Text 9",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 10,
                text = "Text 10",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 11,
                text = "Text 11",
                image = "https://picsum.photos/seed/picsum/200/300"
            ),
            Fakedata(
                id = 12,
                text = "Text 12",
                image = "https://picsum.photos/seed/picsum/200/300"
            )
        )
    }



data class Fakedata(
    val id: Int,
     val text: String,
    val image: String
        )


