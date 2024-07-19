package com.help.pit.features.donate.presentations

import androidx.compose.foundation.layout.Column
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun AddDonation() {
    Column {
        TextField(value = "", onValueChange = {})
    }
}