package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun MainScreen() {
    LazyColumn (Modifier.background(Color(0xFF050B18))) {
        item {
            ScreenHeader(
                imgHeader = R.drawable.bg_header,
                imgLogo = R.drawable.dota,
                appName = "DoTA 2"
            )
        }
        item {
            ScrollableTags(
                items = listOf("MOBY", "MULTIPLAYER", "STRATEGY"),
                modifier = Modifier.padding(start = 24.dp)
            )
        }
        item {
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    // fontFamily = FontFamily(Font(R.font.sk-modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0xB2EEF2FB)
                ),
                modifier = Modifier.padding(24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF050B18)
    ) {
        MainScreen()
    }
}