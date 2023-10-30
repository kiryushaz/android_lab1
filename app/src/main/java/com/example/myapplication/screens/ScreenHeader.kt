package com.example.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun ScreenHeader(imgHeader: Int, imgLogo: Int, appName: String) {
    Column (Modifier.background(Color(0xFF050B18))) {
        Image(
            painter = painterResource(id = imgHeader),
            contentDescription = "bg_header",
            modifier = Modifier.size(340.dp),
            contentScale = ContentScale.Crop,
        )
        Row (modifier = Modifier.padding(start = 24.dp)) {
            Box (
                modifier = Modifier.size(80.dp).offset(y=-24.dp)
                    .border(BorderStroke(2.dp, Color(0xFF1F2430)),
                        shape = RoundedCornerShape(8.dp))
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.Black),
                contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = imgLogo),
                    contentDescription = "logo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(0.6f)
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = appName,
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 26.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.5.sp,
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row (verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painterResource(id = R.drawable.rating),
                        "rating"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "70M",
                        style = TextStyle(
                            fontSize = 12.sp,
                            // fontFamily = FontFamily(Font(R.font.sk-modernist)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF45454D),

                            letterSpacing = 0.5.sp,
                        ))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenHeaderPreview() {
    ScreenHeader(
        imgHeader = R.drawable.bg_header,
        imgLogo = R.drawable.dota,
        appName = "DoTA 2"
    )
}