package com.help.pit.features.donate.presentations

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.help.pit.commons.AppNavBar
import com.help.pit.features.donate.data.DashboardViewModel
import com.help.pit.ui.theme.BackgroundColor

@Composable
fun Dashboard(modifier: Modifier = Modifier) {
    val dashboardViewModel = hiltViewModel<DashboardViewModel>()

    Scaffold(
        containerColor = BackgroundColor,
        bottomBar = { AppNavBar(onClick = dashboardViewModel::onBottomNavItemClick,
            selectedTabIndex = dashboardViewModel.selectedTabIndex) }
    ) {
        Box(modifier = Modifier.padding(it)) {

            when (dashboardViewModel.selectedTabIndex) {
                0 -> Recent()
                1 -> HomeScreen()
                2 -> Community()
            }
        }
    }
}