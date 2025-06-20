package com.malikhain.employee_attendance_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.malikhain.employee_attendance_manager.navigation.AppNavGraph
import com.malikhain.employee_attendance_manager.screens.LoginScreen
import com.malikhain.employee_attendance_manager.ui.theme.EmployeeattendancemanagerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmployeeattendancemanagerTheme {
                AppNavGraph()
            }
        }
    }
}
