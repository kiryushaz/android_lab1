package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun RatingBlock(
    rating: Float,
    reviewsCount: String,
    modifier: Modifier = Modifier
) {
    Row (modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = rating.toString(),
            style = TextStyle(
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
                color = Color(0xFFFFFFFF)
            )
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painterResource(id = R.drawable.rating),
                "rating"
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "$reviewsCount Reviews",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                    color = Color(0xFFA8ADB7),

                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RatingBlockPreview() {
    Surface(color = Color(0xFF050B18)) {
        RatingBlock(4.9f, "70M")
    }
}