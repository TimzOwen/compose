package com.timzowen.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                myApp()
            }
        }
    }
}

// Reusable compose element
@Composable
private fun myApp(){
    Surface(color = MaterialTheme.colors.background){
        Greeting(name = "Hello ")
    }
}

@Composable
private fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Column(modifier = Modifier.padding(28.dp)) {
            Text(text = "Hello android $name")
            Text(text="Testing bank $name")
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ComposeTheme {
        myApp()
    }
}