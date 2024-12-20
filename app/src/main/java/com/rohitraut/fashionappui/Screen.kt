package com.rohitraut.fashionappui

sealed class Screen(val route: String) {
    data object Landing : Screen("landing_screen")
    data object Dashboard : Screen("dashboard_screen")
    data object Product : Screen("product_screen")
    data object Profile: Screen("profile_screen")
    data object Settings: Screen("settings_screen")

}