package com.ucb.app.home.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ucb.app.home.presentation.composable.SectionView
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.frame
import kotlinproject.composeapp.generated.resources.shopping_cart
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.padding(vertical = 20.dp, horizontal = 30.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {
        Row(
            modifier = Modifier.background(Color.Red).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text("Explore", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                Text("Collections")
            }
            Image(
                modifier = Modifier.size(28.dp),
                painter = painterResource(Res.drawable.shopping_cart),
                contentDescription = null,

            )
        }

        SectionView("Children", Res.drawable.frame)
        SectionView("Women", Res.drawable.frame)
        SectionView("Men", Res.drawable.frame)

    }
}