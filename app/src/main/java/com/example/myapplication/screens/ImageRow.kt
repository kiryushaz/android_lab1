package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable
fun ImageRow(items: List<Int>, modifier: Modifier = Modifier) {
    LazyRow(modifier = modifier) {
        itemsIndexed(items) {
            index, item ->

            Image(
                painter = painterResource(id = item),
                contentDescription = "img$index",
                modifier = Modifier.padding(8.dp)
                    .height(135.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageRowPreview() {
    ImageRow(items = listOf(
        R.drawable.bg_video_preview1,
        R.drawable.bg_video_preview2
    ))
}