package com.example.s1101732

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1101732.ui.theme.韓永裕Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            韓永裕Theme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Greeting("Android")
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "作者:資管二A韓永裕")


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    韓永裕Theme {
        Greeting("Android")
    }


}

