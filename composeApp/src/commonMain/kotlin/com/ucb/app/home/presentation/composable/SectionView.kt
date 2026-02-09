package com.ucb.app.home.presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.frame
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun SectionView(
    textButton: String,
    image: DrawableResource
) {
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.Yellow)
    ) {
        Image(
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(image)

        )
        Button(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = {

            }
        ) {
            Text(textButton)
        }
    }
}