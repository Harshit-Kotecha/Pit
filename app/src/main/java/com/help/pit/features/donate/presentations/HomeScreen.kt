package com.help.pit.features.donate.presentations


import AppText
import Screen
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.help.pit.commons.AppButton
import com.help.pit.commons.AppTextField
import com.help.pit.commons.ShadowContainer

@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 16.dp, vertical = 12.dp), verticalArrangement = Arrangement.SpaceBetween) {
        LazyColumn(
            modifier = Modifier
                .padding(
                    horizontal = 16.dp, vertical = 24.dp
                )
        ) {
            item {
                AppText(text = "Hi Pit", style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                AppTextField(label = "Enter name", value = "") {
                    
                }
                Spacer(modifier = Modifier.height(16.dp))
                AppTextField(label = "Enter mobile number", value = "") {

                }
            }
            item {
            Spacer(modifier = Modifier.height(32.dp))
                Box() {
                    AppTextField(label = "Enter name", value = "") {

                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    AppTextField(label = "Enter name", value = "") {

                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    AppTextField(label = "Enter name", value = "") {

                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    AppTextField(label = "Enter name", value = "") {

                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
        AppButton(onClick = {}, text = "Donate", modifier = Modifier.fillMaxWidth())
    }
}