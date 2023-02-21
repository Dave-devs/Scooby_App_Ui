package com.dave_devs.scoobyapp.scooby_feature.presentation.home_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dave_devs.scoobyapp.scooby_feature.domain.model.Dog
import com.dave_devs.scoobyapp.scooby_feature.presentation.components.Heading
import com.dave_devs.scoobyapp.scooby_feature.presentation.components.ItemDogCard

@Composable
fun HomeScreen(
    navController: NavController,
    dogList: List<Dog>
) {
    LazyColumn {
        item {
            Heading()
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(dogList) {
            dogList.forEach {
                ItemDogCard(
                    it,
                    onItemClicked = { dog ->
                        navController.navigate("details/${dog.id}/${dog.name}/${dog.location}")
                    }
                )
            }
        }
    }
}