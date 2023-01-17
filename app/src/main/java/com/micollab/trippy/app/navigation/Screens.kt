package com.micollab.trippy.app.navigation

sealed class Screens(val route: String) {
    object HomeScreen : Screens("HomeScreen")
    object ExploreScreen : Screens("ExploreScreen")
    object NotificationScreen : Screens("NotificationScreen")
    object ProfileScreen : Screens("ProfileScreen")
    object TripDetailsScreen : Screens("TripDetailsScreen")
    object SettingsScreen : Screens("SettingsScreen")
}