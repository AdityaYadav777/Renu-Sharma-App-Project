package com.renush.home.Routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.renush.home.presentation.Home.Home
import com.renush.home.presentation.Notification.NotificationPage
import com.renush.home.presentation.ShowTaskDetails.ShowTaskDetails

@Composable
fun Navigation() {

    val navController= rememberNavController()
    NavHost(navController, startDestination = Routes.Home.Routes) {

        composable(Routes.Home.Routes){
            Home(navController)
        }


        composable(Routes.TaskDetails.Routes){
                 ShowTaskDetails(navController)
        }


        composable(Routes.NotificationPage.Routes){
              NotificationPage()
        }


    }

}