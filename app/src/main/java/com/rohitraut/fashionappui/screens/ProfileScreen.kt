package com.rohitraut.fashionappui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Profile Image
        Image(
            imageVector = Icons.Outlined.Person,
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp)
                .padding(16.dp)
                .aspectRatio(1f)
                .clip(CircleShape)
        )

        // Profile Name
        Text(
            text = "Rohit Raut",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        // Email Address
        Text(
            text = "rohit.raut2612@gmail.com",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Navigation Buttons
        Button(
            onClick = { navController.navigate("dashboard_screen") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF509790)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Go to Dashboard",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

    }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen(navController = rememberNavController())
}
