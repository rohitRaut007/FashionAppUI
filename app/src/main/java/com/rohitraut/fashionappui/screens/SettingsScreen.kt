package com.rohitraut.fashionappui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rohitraut.fashionappui.R

@Composable
fun SettingsScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        // Header
        Text(
            text = "Settings",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            color = Color.Black
        )

        // Profile Section
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .clickable { /* Navigate to Profile or Edit Profile */ },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_1),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(32.dp)
                    )
            )
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
            ) {
                Text(text = "Rohit Raut", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "View Profile", color = Color.Gray, fontSize = 14.sp)
            }
        }

        Divider(color = Color.LightGray, thickness = 1.dp)

        // Settings Options
        SettingsOption(
            icon = Icons.Outlined.Person,
            title = "Account Settings",
            onClick = { /* Navigate to Account Settings */ }
        )
        SettingsOption(
            icon = Icons.Outlined.Notifications,
            title = "Notification Settings",
            onClick = { /* Navigate to Notification Settings */ }
        )
        SettingsOption(
            icon = Icons.Outlined.Lock,
            title = "Privacy & Security",
            onClick = { /* Navigate to Privacy & Security */ }
        )
        SettingsOption(
            icon = Icons.Outlined.Info,
            title = "Help & Support",
            onClick = { /* Navigate to Help & Support */ }
        )

        Divider(color = Color.LightGray, thickness = 1.dp)

        // General Settings
        SettingsOption(
            icon = Icons.Outlined.Settings,
            title = "App Settings",
            onClick = { /* Navigate to App Settings */ }
        )
        SettingsOption(
            icon = Icons.Default.ArrowForward,
            title = "Log Out",
            onClick = { /* Handle Log Out */ }
        )
    }
}

@Composable
fun SettingsOption(icon: androidx.compose.ui.graphics.vector.ImageVector, title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
            .clickable(onClick = onClick),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .padding(end = 16.dp),
            tint = Color.Gray
        )
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color.Gray
        )
    }
}

@Preview
@Composable
private fun SettingsScreenPreview() {
    SettingsScreen(navController = rememberNavController())
}
