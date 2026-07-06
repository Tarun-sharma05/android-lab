package com.tarun.androidlab.demos.fundamentals.lists

import android.graphics.pdf.models.ListItem
import androidx.compose.runtime.Composable

@Composable
fun LazyVerticalStaggeredGridDemo (){

}

fun sampleImages(  ): List<photos>{
     return listOf(
         photos(
             id = 1,
             img = "https://picsum.photos/seed/1/200/200"
         ),
         photos(
             id = 2,
             img = "  https://picsum.photos/seed/2/200/300        "
         ),
         photos(
             id = 3,
             img = " https://picsum.photos/seed/3/200/150  "
         ),photos(
             id = 4,
             img = " https://picsum.photos/seed/4/200/350"
         ),photos(
             id = 5,
             img = " https://picsum.photos/seed/5/200/250  "
         ),photos(
             id = 6,
             img = "https://picsum.photos/seed/1/200/200"
         ),photos(
             id = 7,
             img = "https://picsum.photos/seed/1/200/200"
         ),photos(
             id = 8,
             img = "https://picsum.photos/seed/1/200/200"
         ),photos(
             id = 9,
             img = "https://picsum.photos/seed/1/200/200"
         ),photos(
             id = 10,
             img = "https://picsum.photos/seed/12/200/130"
         ),photos(
             id = 11,
             img =  "https://picsum.photos/seed/11/200/240"
         ),photos(
             id = 12,
             img =  "https://picsum.photos/seed/12/200/130"
         ),
         )

}

data class photos(
    val id: Int,
    val img: String
)