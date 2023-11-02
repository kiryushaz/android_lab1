package com.example.myapplication.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.CirclePlayColor

@Composable
fun ImageRow(
    items: List<Int>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues()
) {
    val context = LocalContext.current
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        itemsIndexed(items) {
            index, item ->
            Box (contentAlignment = Alignment.Center,
                modifier = Modifier.clickable {
                    Toast.makeText(context, "watching item ${index+1}", Toast.LENGTH_LONG).show()
                }) {
                Image(
                    painter = painterResource(id = item),
                    contentDescription = "img$index",
                    modifier = Modifier
                        .height(135.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Box (modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(CirclePlayColor),
                    contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                        contentDescription = "playVideo",
                        modifier = Modifier.fillMaxSize(0.7f)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageRowPreview() {
    ImageRow(items = listOf(
        R.drawable.bg_video_preview1,
        R.drawable.bg_video_preview2
    ),
        modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp))
}