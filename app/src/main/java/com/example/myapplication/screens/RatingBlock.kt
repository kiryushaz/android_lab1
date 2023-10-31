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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.Background
import com.example.myapplication.ui.theme.SkModernist

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
                fontFamily = SkModernist,
                fontWeight = FontWeight.Bold,
                color = Color.White
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
                    fontFamily = SkModernist,
                    fontWeight = FontWeight.Normal,
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
    Surface(color = Background) {
        RatingBlock(4.9f, "70M")
    }
}