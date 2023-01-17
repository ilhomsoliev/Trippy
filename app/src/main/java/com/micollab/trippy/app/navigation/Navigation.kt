package com.micollab.trippy.app.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val currentScreen = navController.currentBackStackEntryAsState().value?.destination?.route?:""
    Scaffold(scaffoldState = scaffoldState,
        bottomBar = {
            com.micollab.trippy.app.navigation.bottomBar.BottomNavigation(navController = navController)
        }
    ) {
        NavHost(
            modifier = Modifier.padding(it),
            navController = navController,
            startDestination = Screens.HomeScreen.route
        ) {
            composable(route = Screens.HomeScreen.route) {

            }
            composable(route = Screens.ExploreScreen.route) {

            }
            composable(route = Screens.NotificationScreen.route) {

            }
            composable(route = Screens.ProfileScreen.route) {

            }
            composable(route = Screens.TripDetailsScreen.route) {

            }
            composable(route = Screens.SettingsScreen.route) {

            }
        }
    }
}