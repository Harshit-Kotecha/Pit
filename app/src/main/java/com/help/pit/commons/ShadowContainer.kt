package com.help.pit.commons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ShadowContainer(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    ElevatedCard(
        colors = CardColors(
            containerColor = Color.Red, contentColor = Color.Black,
            disabledContentColor = Color.Gray, disabledContainerColor = Color.White
        ),
        modifier = Modifier
            .shadow(
                shape = CardDefaults.elevatedShape,
                ambientColor = Color.Black,
                spotColor = Color.Black,
                elevation = 10.dp,
            ),
        onClick = {},
    ) {
        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 22.dp)) {
            content()
        }
    }
}