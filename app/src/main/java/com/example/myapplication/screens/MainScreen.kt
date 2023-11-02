package com.example.myapplication.screens

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.data.Comment
import com.example.myapplication.ui.theme.Background
import com.example.myapplication.ui.theme.GhostWhite
import com.example.myapplication.ui.theme.HorizontalLineColor
import com.example.myapplication.ui.theme.Mustard
import com.example.myapplication.ui.theme.SkModernist

@Composable
fun MainScreen() {
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            ScreenHeader(
                imgHeader = R.drawable.bg_header,
                imgLogo = R.drawable.dota,
                appName = stringResource(id = R.string.dota)
            )
        }
        item {
            ScrollableTags(
                items = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        }
        item {
            Text(
                    text = stringResource(id = R.string.description),
                    style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    fontFamily = SkModernist,
                    fontWeight = FontWeight.Normal,
                    color = GhostWhite
                ),
                modifier = Modifier.padding(24.dp)
            )
        }
        item {
            ImageRow(
                items = listOf(
                    R.drawable.bg_video_preview1,
                    R.drawable.bg_video_preview2
                ),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        }
        item {
            Text(
                text = stringResource(id = R.string.review_block_name),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = SkModernist,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    letterSpacing = 0.6.sp,
                ),
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 12.dp
                )
            )
        }
        item {
            RatingBlock(
                rating = 4.9f, reviewsCount = "70M",
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 12.dp
                )
            )
        }
        val comments = listOf(
            Comment(
                avatar = R.drawable.avatar_1,
                name = "Auguste Conte",
                date = "February 14, 2019",
                text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
            ),
            Comment(
                avatar = R.drawable.avatar_2,
                name = "Jang Marcelino",
                date = "February 14, 2019",
                text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
            )
        )
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
        item {
            Button(
                modifier = Modifier
                    .padding(24.dp)
                    .height(64.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Mustard),
                shape = RoundedCornerShape(size = 12.dp),
                onClick = {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
                }
            ) {
                Text(
                    text = stringResource(id = R.string.btn_text),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = SkModernist,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        letterSpacing = 0.6.sp,
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Background
    ) {
        MainScreen()
    }
}