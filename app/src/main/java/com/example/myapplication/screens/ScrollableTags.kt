package com.example.myapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Background
import com.example.myapplication.ui.theme.Montserrat

@Composable
fun ScrollableTags(
    items: List<String>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues()
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        itemsIndexed(items) { _, item ->
            Surface(
                color = Color(0x3D44A9F4),
                contentColor = Color(0xFF44A9F4),
                shape = CircleShape
            ) {
                Text(
                    text = item,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Montserrat
                    ),
                    modifier = Modifier.padding(
                        start = 12.dp,
                        end = 12.dp,
                        top = 8.dp,
                        bottom = 8.dp
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScrollableTagsPreview() {
    Surface(color = Background) {
        ScrollableTags(
            items = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
            contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
        )
    }
}