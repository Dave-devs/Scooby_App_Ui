package com.dave_devs.scoobyapp.scooby_feature.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Heading() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Hey! Scooby Family,",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.surface
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Looking to add a new member to you family?",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.surface
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 24.dp, 36.dp, 0.dp),
            horizontalArrangement = Arrangement.End
        ) {
            ScoobyLogo()
        }
    }
}

@Composable
fun ScoobyLogo() {
    Icon(
        imageVector = Icons.Default.Pets,
        contentDescription = "pet logo",
        tint = MaterialTheme.colors.primary,
        modifier = Modifier
            .size(24.dp, 24.dp)
    )
}