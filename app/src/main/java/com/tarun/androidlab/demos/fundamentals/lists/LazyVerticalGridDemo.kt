package com.tarun.androidlab.demos.fundamentals.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.tarun.androidlab.ui.theme.AndroidLabTheme

@Composable
fun LazyVerticalGridDemo(items: List<Product>) {


    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        LazyVerticalGrid(GridCells.Fixed(2)) {
            items(
                items = items,
                key = { item -> item.id }
            ) { item ->

              EachCard(item = item)

//            Card(modifier = Modifier
//                .padding(8.dp)
//                .fillMaxWidth(),
//                colors = CardDefaults.cardColors(Color.Black)
//                ) {
//                Column(modifier = Modifier.fillMaxSize(),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally) {
//                    Column(Modifier.background(color = Color.Blue),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally) {
//                        Text(text = item.text,
//                             color = Color.White,
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.ExtraBold
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(8.dp))
//
//                    Column(modifier = Modifier.background(color = Color.Red),
//                          verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally) {
//                    AsyncImage(
//                        model = item.image,
//                        contentDescription = null,
//                        Modifier.size(200.dp)
//                    )
//                    }
//
//
//                }
//            }
        }
        }
    }

}

@Composable
fun EachCard(item: Product, modifier: Modifier = Modifier) {

    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = item.text,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            Column(
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


fun sampleData(): List<Product>{
        return listOf(
            Product(
               id=1,
               text = "Text1",
               image = "https://picsum.photos/seed/1/200/300"
            ),
            Product(
                id = 2,
                text = "Text 2",
                image = "https://picsum.photos/seed/2/200/300"
            ),
            Product(
                id = 3,
                text = "Text 3",
                image = "https://picsum.photos/seed/3/200/300"
            ),
            Product(
                id = 4,
                text = "Text 4",
                image = "https://picsum.photos/seed/4/200/300"
            ),
            Product(
                id = 5,
                text = "Text 5",
                image = "https://picsum.photos/seed/5/200/300"
            ),
            Product(
                id = 6,
                text = "Text 6",
                image = "https://picsum.photos/seed/6/200/300"
            ),
            Product(
                id = 7,
                text = "Text 7",
                image = "https://picsum.photos/seed/7/200/300"
            ),
            Product(
                id = 8,
                text = "Text 8",
                image = "https://picsum.photos/seed/8/200/300"
            ),
            Product(
                id = 9,
                text = "Text 9",
                image = "https://picsum.photos/seed/9/200/300"
            ),
            Product(
                id = 10,
                text = "Text 10",
                image = "https://picsum.photos/seed/10/200/300"
            ),
            Product(
                id = 11,
                text = "Text 11",
                image = "https://picsum.photos/seed/11/200/300"
            ),
            Product(
                id = 12,
                text = "Text 12",
                image = "https://picsum.photos/seed/12/200/300"
            )
        )
    }



data class Product(
    val id: Int,
    val text: String,
    val image: String
    )


@Preview
@Composable
fun LazyVerticalGridDemoPreview(){
    AndroidLabTheme() {
LazyVerticalGridDemo(items = sampleData())
    }
}