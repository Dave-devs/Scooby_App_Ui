package com.dave_devs.scoobyapp.scooby_feature.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun VetCard(name: String, bio: String, image: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // getting the image from the drawable
        val personImage: Painter = painterResource(id = image)

        Image(
            modifier = Modifier
                .size(60.dp, 60.dp)
                .clip(RoundedCornerShape(16.dp)),
            painter = personImage,
            alignment = Alignment.CenterStart,
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier) {
            Text(
                text = name,
                color = MaterialTheme.colors.onSurface,
                style = typography.subtitle1,
                fontWeight = FontWeight.W600,
                textAlign = TextAlign.Start
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = bio,
                color = MaterialTheme.colors.onSurface,
                style = typography.caption
            )
        }
    }
}