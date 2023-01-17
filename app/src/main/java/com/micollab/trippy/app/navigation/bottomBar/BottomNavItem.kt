package com.micollab.trippy.app.navigation.bottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.micollab.trippy.app.navigation.Screens

sealed class BottomNavItem(var title:String, var icon:ImageVector, var screen_route:String){

    object Goals : BottomNavItem("Home", Icons.Default.Home, Screens.HomeScreen.route)
    object ToDoList: BottomNavItem("Explore",Icons.Default.Explore,Screens.ExploreScreen.route)
    object Tracker: BottomNavItem("Notification",Icons.Default.Notifications,Screens.NotificationScreen.route)
    object Notes: BottomNavItem("Profile",Icons.Default.Person,Screens.ProfileScreen.route)
}