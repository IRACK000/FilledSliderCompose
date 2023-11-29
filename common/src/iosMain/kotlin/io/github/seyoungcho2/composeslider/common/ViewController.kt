package io.github.seyoungcho2.composeslider.common

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController


fun MainViewController(): UIViewController = ComposeUIViewController {
    App()
}
