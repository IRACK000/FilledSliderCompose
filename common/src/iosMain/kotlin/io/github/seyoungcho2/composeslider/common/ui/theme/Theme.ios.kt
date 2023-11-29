package io.github.seyoungcho2.composeslider.common.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable


@Composable
actual fun ComposeSliderTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    typography: Typography,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else      -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )
}
