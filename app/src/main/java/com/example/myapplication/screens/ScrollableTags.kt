package com.example.myapplication.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScrollableTags(items: List<String>, modifier: Modifier = Modifier) {
    LazyRow (modifier = modifier) {
        itemsIndexed(items) { _, item ->
            Surface(
                color = Color(0x3D44A9F4),
                contentColor = Color(0xFF44A9F4),
                shape = CircleShape,
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = item,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScrollableTagsPreview() {
    Surface(color = Color(0xFF050B18)) {
        ScrollableTags(items = listOf("MOBY", "MULTIPLAYER", "STRATEGY"))
    }
}