package com.help.pit.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.help.pit.R

val OpenSans = FontFamily(
    Font(R.font.open_sans_regular),
    Font(R.font.open_sans_bold, weight = FontWeight.Bold),
    Font(R.font.open_sans_medium, weight = FontWeight.Medium),
    Font(R.font.open_sans_semibold, weight = FontWeight.SemiBold),
    Font(R.font.open_sans_medium, weight = FontWeight.Normal),
)

val Poppins = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_bold, weight = FontWeight.Bold),
    Font(R.font.poppins_medium, weight = FontWeight.Medium),
    Font(R.font.poppins_semibold, weight = FontWeight.SemiBold),
    Font(R.font.poppins_black, weight = FontWeight.Normal),
)

val PlayfairDisplay = FontFamily(
    Font(R.font.playfair_display),
    Font(R.font.playfair_italic)
)

private val defaultTypography = Typography()
private val defaultFont = OpenSans

val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = defaultFont),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = defaultFont),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = defaultFont),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = defaultFont),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = defaultFont),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = defaultFont),

    titleLarge = TextStyle(
        fontFamily = defaultFont,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = defaultFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = defaultFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
    ),

    bodyLarge = TextStyle(
        fontFamily = defaultFont,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = defaultFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = defaultFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = defaultFont),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = defaultFont),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = defaultFont)
)