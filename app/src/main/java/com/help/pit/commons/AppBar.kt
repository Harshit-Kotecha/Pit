package com.help.pit.commons

import AppText
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.help.pit.R


@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    title: String,
    showBackIcon: Boolean = true,
) {
    Column(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding
                (
                horizontal = 16.dp, vertical = 18.dp
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.back_arrow),
                contentDescription = "back arrow",
                tint = Color.White,
                modifier = Modifier
                    .padding(start = 4.dp, end = 12.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )
            Spacer(Modifier.width(12.dp))
            AppText(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 6.dp)
            )
        }
        AppHorizontalDivider()
    }
}