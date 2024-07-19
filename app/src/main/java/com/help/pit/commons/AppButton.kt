package com.help.pit.commons

import AppText
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.help.pit.ui.theme.PrimaryColor
import com.help.pit.ui.theme.PrimaryGradient1
import com.help.pit.ui.theme.PrimaryGradient2
import com.help.pit.ui.theme.SecondaryColor
import com.help.pit.ui.theme.SecondaryGradient1

@Composable
fun AppButton(modifier: Modifier = Modifier, isPrimary: Boolean = true) {
    val bgColors = if (isPrimary) listOf(
        PrimaryColor,
        PrimaryGradient1,
        PrimaryGradient2,
    ) else listOf(
        SecondaryColor,
        SecondaryGradient1,
    )

    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(100.dp))
            .clickable {

            }
            .background(
                brush = Brush.horizontalGradient(
                    colors = bgColors,
                )
            )
            .padding(horizontal = 32.dp, vertical = 16.dp)
    ) {
        AppText(text = "Continue", style = MaterialTheme.typography.bodyMedium)
    }
}