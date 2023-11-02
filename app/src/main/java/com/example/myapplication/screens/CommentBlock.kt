package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.data.Comment
import com.example.myapplication.ui.theme.Background
import com.example.myapplication.ui.theme.FrenchGray
import com.example.myapplication.ui.theme.GhostlyWhite
import com.example.myapplication.ui.theme.HorizontalLineColor
import com.example.myapplication.ui.theme.SkModernist

@Composable
fun CommentBlock(
    comment: Comment,
    modifier: Modifier = Modifier
) {
    Column (modifier = modifier) {
        Row {
            Image(
                painter = painterResource(id = comment.avatar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = comment.name,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = SkModernist,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        letterSpacing = 0.5.sp,
                    )
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = comment.date,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = SkModernist,
                        fontWeight = FontWeight.Normal,
                        color = GhostlyWhite,
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = comment.text,
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontFamily = SkModernist,
                fontWeight = FontWeight.Normal,
                color = FrenchGray,

                letterSpacing = 0.5.sp,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CommentBlocksPreview() {
    Surface(color = Background) {
        val comments = listOf(
            Comment(
                avatar = R.drawable.avatar_1,
                name = "Auguste Conte",
                date = "February 14, 2019",
                text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"),
            Comment(
                avatar = R.drawable.avatar_2,
                name = "Jang Marcelino",
                date = "February 14, 2019",
                text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”")
        )
        LazyColumn {
            itemsIndexed(comments) { index, item ->
                CommentBlock(
                    item,
                    modifier = Modifier.padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
                )
                if (index < comments.lastIndex) {
                    Divider(
                        color = HorizontalLineColor,
                        thickness = 1.dp,
                        modifier = Modifier.padding(
                            start = 32.dp,
                            end = 32.dp,
                            top = 12.dp,
                            bottom = 12.dp
                        )
                    )
                }
            }
        }
    }
}