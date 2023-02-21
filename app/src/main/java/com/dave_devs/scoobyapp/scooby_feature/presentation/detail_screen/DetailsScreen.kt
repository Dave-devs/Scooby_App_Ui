package com.dave_devs.scoobyapp.scooby_feature.presentation.detail_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dave_devs.scoobyapp.R
import com.dave_devs.scoobyapp.scooby_feature.data.FakeDogData
import com.dave_devs.scoobyapp.scooby_feature.presentation.components.DogInfoCard
import com.dave_devs.scoobyapp.scooby_feature.presentation.components.InfoCard
import com.dave_devs.scoobyapp.scooby_feature.presentation.components.VetCard

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavController, id: Int) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Details") },
                backgroundColor = MaterialTheme.colors.background,
                contentColor = MaterialTheme.colors.onSurface,
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp, 24.dp)
                            .clickable {
                                navController.navigateUp()
                            },
                        tint = MaterialTheme.colors.onSurface
                    )
                }
            )
        },

        content = {
            DetailsView(id)
        }
    )
}

@Composable
fun DetailsView(id: Int) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background)
    ) {
        val dog = FakeDogData.dogList[id]

        // Basic details
        item {
            dog.apply {

                val dogImage: Painter = painterResource(id = dog.image)
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(346.dp),
                    painter = dogImage,
                    alignment = Alignment.CenterStart,
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(16.dp))
                DogInfoCard(name, gender, location)
            }
        }
        // My story details
        item {
            dog.apply {
                Spacer(modifier = Modifier.height(24.dp))
                Title(title = "Dog Data")
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = data,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp, 0.dp, 16.dp, 0.dp),
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.body2,
                    textAlign = TextAlign.Start
                )
            }
        }
        // Quick info
        item {
            dog.apply {

                Spacer(modifier = Modifier.height(24.dp))
                Title(title = "Dog info")
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp, 0.dp, 16.dp, 0.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    InfoCard(title = "Age", value = dog.age.plus(" yrs"))
                    InfoCard(title = "Color", value = color)
                    InfoCard(title = "Weight", value = weight.toString().plus("Kg"))
                }
            }
        }

        // Owner info
        item {
            dog.apply {
                Spacer(modifier = Modifier.height(24.dp))
                Title(title = "Vet info")
                Spacer(modifier = Modifier.height(16.dp))
                vet.apply {
                    VetCard(name, bio, image)
                }
            }
        }
        // CTA - Adopt me button
        item {
            Spacer(modifier = Modifier.height(36.dp))
            Button(
                onClick = { /* Do something! */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(16.dp, 0.dp, 16.dp, 0.dp),
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = Color.White
                )
            ) {
                Text("Adopt me")
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun Title(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 0.dp, 0.dp, 0.dp),
        color = MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.subtitle1,
        fontWeight = FontWeight.W600,
        textAlign = TextAlign.Start
    )
}