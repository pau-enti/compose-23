package com.enti.composeaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ListActivityContent()
        }
    }
}