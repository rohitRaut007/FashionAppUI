package com.rohitraut.fashionappui

import CartScreen
import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.rohitraut.fashionappui.screens.CartScreen
import com.rohitraut.fashionappui.screens.DashboardScreen
import com.rohitraut.fashionappui.screens.LandingScreen
import com.rohitraut.fashionappui.screens.ProductScreen
import com.rohitraut.fashionappui.screens.ProfileScreen
import com.rohitraut.fashionappui.screens.SettingsScreen
import com.rohitraut.fashionappui.screens.WishlistScreen
import kotlin.math.round

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Landing.route)
    {
        composable(route = Screen.Landing.route) {
            LandingScreen(navController = navController)
        }
        composable(route = Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
        composable(route = Screen.Product.route) {
            ProductScreen(navController = navController)
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }
        composable(route = Screen.Settings.route) {
            SettingsScreen(navController = navController)
        }
        composable(route = Screen.Favourite.route) {
            WishlistScreen(navController = navController)
        }
        composable(route = Screen.Cart.route) {
            CartScreen(navController = navController)
        }
    }
}