package kr.co.batontouch.layoutsinjetpack

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

@Preview
@Composable
fun Material() {

    TopAppBar(
        title = {
            Text(text = "Page Title", maxLines = 2)
        },
        navigationIcon = {
//            Icon(R.drawable.ic_launcher_background)
        }
    )

    Button {
        Row {
            MyImage()
        }
    }
}

@Composable
fun Button(
    modifier: Modifier = Modifier(),
    onclick: (() -> Unit)? = null,
    content: @Composable () -> Unit
) = Unit

@Composable
fun MyImage(){

}