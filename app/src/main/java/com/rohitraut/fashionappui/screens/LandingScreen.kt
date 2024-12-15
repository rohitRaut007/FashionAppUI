package com.rohitraut.fashionappui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rohitraut.fashionappui.R
import com.rohitraut.fashionappui.Screen
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun LandingScreen(navController: NavController, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.landing_img),
            contentDescription = "Landing Page",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
            )

        Box(modifier = Modifier
            .fillMaxWidth()
            .heightIn(10.dp,90.dp)
            .background(color = Color.Gray)
            .align(Alignment.BottomCenter)
        ){
            Row(modifier = Modifier
                .background(
                    color = Color.Red,
                    shape = RoundedCornerShape(16.dp)
                )
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .clickable { navController.navigate(Screen.Dashboard.route) }
                .padding(16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            )
            {
                Text(
                    text = "Get Started ",
                    fontSize = 16.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.wrapContentWidth()

                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_24),
                    contentDescription = "arrow",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            }

        }

    }

}


@Preview
@Composable
private fun LandingScreenPrev() {
    LandingScreen(navController = rememberNavController())
}