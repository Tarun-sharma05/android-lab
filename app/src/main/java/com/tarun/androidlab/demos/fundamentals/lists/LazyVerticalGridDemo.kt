package com.tarun.androidlab.demos.fundamentals.lists

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.R
import coil3.compose.AsyncImage

@Composable
fun LazyVerticalGridDemo(items: List<Fakedata>) {


    Column(){

        LazyColumn() {
            items(
                items = items,
                key = { item -> item.id }
            ) { item ->



            Card() {
                Row() {
                    Column() {
                        Text(text = item.text)
                    }
                    Spacer(modifier = Modifier.width(12.dp))

                    AsyncImage(
                        model = item.image,
                        contentDescription = null
                    )


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
            )
        )
    }



data class Fakedata(
    val id: Int,
     val text: String,
    val image: String
        )