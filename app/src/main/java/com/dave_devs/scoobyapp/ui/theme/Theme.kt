package com.dave_devs.scoobyapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Primary,
    onPrimary = White,
    surface = DarkSurface,
    background = DarkBackground,
    secondary = Red,
    onSurface = TextDark
)

private val LightColorPalette = lightColors(
    primary = Primary,
    onPrimary = White,
    surface = LightSurface,
    background = LightBackground,
    secondary = Red,
    onSurface = TextLight

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ScoobyAppUiTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val systemUiController = rememberSystemUiController()
    SideEffect{
        systemUiController.setSystemBarsColor(
            color = if(darkTheme) Color.Black else Primary
        )
    }

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}