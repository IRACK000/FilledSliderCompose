package io.github.seyoungcho2.composeslider

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import io.github.seyoungcho2.composeslider.common.App
import io.github.seyoungcho2.composeslider.ui.theme.robotoTypography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(typography = robotoTypography)
        }
    }
}


@Preview
@Composable
fun DefaultPreview() {
    App()
}

