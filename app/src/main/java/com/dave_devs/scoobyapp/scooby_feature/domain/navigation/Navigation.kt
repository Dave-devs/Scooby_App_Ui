package com.dave_devs.scoobyapp.scooby_feature.domain.navigation

import androidx.compose.animation.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dave_devs.scoobyapp.scooby_feature.data.FakeDogData
import com.dave_devs.scoobyapp.scooby_feature.domain.navigation.util.Routes
import com.dave_devs.scoobyapp.scooby_feature.presentation.detail_screen.DetailsScreen
import com.dave_devs.scoobyapp.scooby_feature.presentation.home_screen.HomeScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation(
    navController: NavHostController = rememberNavController(),
    startDestination: String = Routes.HOME_SCREEN
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = startDestination,
    ){
        composable(Routes.HOME_SCREEN) {
            HomeScreen(navController = navController, FakeDogData.dogList)
        }
        composable(
            "${Routes.DETAILS_SCREEN}/{id}/{title}/{location}",
            arguments = listOf(
                navArgument("id")
                {type = NavType.IntType}
            )
        ) {
            DetailsScreen(navController, it.arguments?.getInt("id") ?: 0)
        }
    }
}