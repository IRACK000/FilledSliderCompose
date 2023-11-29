package io.github.seyoungcho2.composeslider.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.seyoungcho2.composeslider.common.sample.DragSensitivitySample
import io.github.seyoungcho2.composeslider.common.sample.SliderOrientationSample
import io.github.seyoungcho2.composeslider.common.sample.SliderShapeSample
import io.github.seyoungcho2.composeslider.common.sample.SliderTypeSample
import io.github.seyoungcho2.composeslider.common.ui.theme.ComposeSliderTheme
import androidx.compose.material3.Typography


@Composable
fun App(typography: Typography = MaterialTheme.typography) {
    ComposeSliderTheme(typography = typography) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .statusBarsPadding()
        ) {
            SliderShapeSample()
            SliderOrientationSample()
            SliderTypeSample()
            DragSensitivitySample()
        }
    }
}
