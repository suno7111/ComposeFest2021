package kr.co.batontouch.tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.co.batontouch.tutorial.ui.theme.TutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Android")
        }
    }
}

data class Message (val author: String, val body: String)

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name")
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("Android")

}