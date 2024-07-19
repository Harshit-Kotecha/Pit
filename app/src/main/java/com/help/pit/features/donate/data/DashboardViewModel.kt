package com.help.pit.features.donate.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

class DashboardViewModel : ViewModel() {
    private var _selectedTabIndex by mutableIntStateOf(1)

    var selectedTabIndex
        get() = _selectedTabIndex
        set(value) {_selectedTabIndex = value}

    fun onBottomNavItemClick(index : Int) {
        selectedTabIndex = index
    }
}