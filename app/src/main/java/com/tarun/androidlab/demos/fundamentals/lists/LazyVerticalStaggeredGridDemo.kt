package com.tarun.androidlab.demos.fundamentals.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.tarun.androidlab.ui.theme.AndroidLabTheme

@Composable
fun LazyVerticalStaggeredGridDemo (items: List<Photos>) {

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        content = {
            items(items) { item ->
                AsyncImage(
                    model = item.img,
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                )
            }
        },
        modifier = Modifier.fillMaxSize()
    )


}

fun sampleImages(  ): List<Photos>{
     return listOf(
         Photos(
             id = 1,
             img = "https://picsum.photos/seed/1/200/200"
         ),
         Photos(
             id = 2,
             img = "https://picsum.photos/seed/2/200/300"
         ),
         Photos(
             id = 3,
             img = "https://picsum.photos/seed/3/200/150"
         ),
         Photos(
             id = 4,
             img = "https://picsum.photos/seed/4/200/350"
         ),
         Photos(
             id = 5,
             img = "https://picsum.photos/seed/5/200/250"
         ),
         Photos(
             id = 6,
             img = "https://picsum.photos/seed/6/200/180"
         ),
         Photos(
             id = 7,
             img = "https://picsum.photos/seed/7/200/320"
         ),
         Photos(
             id = 8,
             img = "https://picsum.photos/seed/8/200/220"
         ),
         Photos(
             id = 9,
             img = "https://picsum.photos/seed/9/200/280"
         ),
         Photos(
             id = 10,
             img = "https://picsum.photos/seed/10/200/160"
         ),
         Photos(
             id = 11,
             img =  "https://picsum.photos/seed/11/200/240"
         ),
         Photos(
             id = 12,
             img =  "https://picsum.photos/seed/12/200/130"
         ),
         )

}

data class Photos(
    val id: Int,
    val img: String
)



@Preview
@Composable
fun LazyVerticalStaggeredGridDemoPreview() {
    AndroidLabTheme {
        LazyVerticalStaggeredGridDemo(items = sampleImages())
    }
}
