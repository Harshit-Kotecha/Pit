package com.help.pit.commons

import AppText
import BottomNavItem
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.help.pit.ui.theme.BackgroundColor
import com.help.pit.ui.theme.PrimaryColor

@Composable
fun BottomNavBar(
    modifier: Modifier = Modifier,
    tabs: Array<BottomNavItem>,
    selectedTab:
    Int,
    navController: NavHostController,
    onClick: (index: Int, route: String, navController: NavHostController) -> Unit,
) {
    val itemColor = { index: Int -> if (index == selectedTab) PrimaryColor else Color.White }

    BottomNavigation(
        backgroundColor = BackgroundColor,
        contentColor = Color.White,
        modifier = modifier,
        elevation = 5.dp,
    ) {
        tabs.forEachIndexed { index, bottomNavItem ->
            BottomNavigationItem(
                selectedContentColor = PrimaryColor,
                unselectedContentColor = Color.White,
                selected = selectedTab == index,
                onClick = {
                    onClick(index, bottomNavItem.route, navController)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = bottomNavItem.icon),
                        contentDescription = "bottom nav item",
                        tint = itemColor(index),
                    )
                },
                label = {
                    Box(modifier = Modifier.padding(top = 2.dp)) {
                        AppText(
                            text = bottomNavItem.label,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = itemColor(index),
                        )
                    }
                },
            )
        }
    }
}