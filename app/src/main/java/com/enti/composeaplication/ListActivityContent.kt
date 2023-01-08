package com.enti.composeaplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


val objects = List(100) {
    "Item $it"
}

@Preview(backgroundColor = 0xFFFFFFFF)
@Composable
fun ListActivityContent() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        objects.forEach {
            item {
                ListItem(text = it)
            }
        }
    }
}

@Composable
fun ListItem(text: String) {
    var isBackground by rememberSaveable { mutableStateOf(false) }
    val background = if (isBackground) Color.Blue else Color.Transparent

    Row(
        modifier = Modifier
            .height(50.dp)
            .clickable {
                isBackground = !isBackground
            }

    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_android_black_24dp),
            contentDescription = null,
            tint = background,
            modifier = Modifier.padding(10.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(0.9f),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text)
        }
    }


}

@Composable
fun SimpleTexts() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Hello!",
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5F)
                .background(Color.Magenta)
                .wrapContentSize(
                    Alignment.Center
                )
                .clip(RoundedCornerShape(55.dp))
        )
        Text(
            text = "Hello!",
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5F)
                .background(Color.LightGray)
                .wrapContentSize(
                    Alignment.Center
                )
                .clip(RoundedCornerShape(55.dp))
        )
    }
}