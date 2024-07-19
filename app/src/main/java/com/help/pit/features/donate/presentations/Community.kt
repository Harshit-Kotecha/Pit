package com.help.pit.features.donate.presentations

import AppText
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.help.pit.R
import com.help.pit.commons.AppButton
import com.help.pit.commons.DonationInfo
import com.help.pit.commons.ShadowContainer
import com.help.pit.ui.theme.Grey

@Preview(showSystemUi = true)
@Composable
fun Community() {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 32.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.profile), contentDescription =
                    "profile", modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                AppText(text = "Pit India", style = MaterialTheme.typography.bodyMedium)
            }
            AppButton(text = "Leaderboards", onClick = {}, isPrimary = false)
        }
        Spacer(modifier = Modifier.height(16.dp))
        DonationInfo()
    }

}