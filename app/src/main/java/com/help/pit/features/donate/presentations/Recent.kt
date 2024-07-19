package com.help.pit.features.donate.presentations

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.help.pit.commons.DonationInfo

@Preview(showSystemUi = true)
@Composable
fun Recent() {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)) {
        DonationInfo()
    }
}