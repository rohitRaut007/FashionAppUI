package com.rohitraut.fashionappui.screens

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rohitraut.fashionappui.R

@Composable
fun ProductScreen(navController: NavController) {
    Column (
        modifier = Modifier
        .fillMaxSize()
        .background(
            color = Color.White,
            shape = RectangleShape
        )
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                imageVector = (Icons.Default.ArrowBack),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .fillMaxSize()
                    .clickable {
                        navController.navigateUp()
                    }
            )

            Text(
                text = "PRODUCT",
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterVertically)

            )

            Image(
               imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = null,
//                tint = Color(android.graphics.Color.parseColor("#509790")),
                modifier = Modifier.size(30.dp)
            )


        }
        Column(modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.profile_1),
                contentDescription = null,
                modifier = Modifier
                    .size(400.dp)

            )
            Text(
                text = "Summer outfit",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
            )

            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequ",
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),

            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                horizontalArrangement = Arrangement.End
            )
            {
                Image(
                    imageVector = Icons.Outlined.Star,
                    contentDescription = null,
                    colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(color = Color.Yellow)
                    )
                Image(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(color = Color.Yellow)
                )
                Image(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(color = Color.Yellow)
                )
                Image(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(color = Color.Yellow)
                )

            }
            Text(
                text = "Price",
                fontWeight = FontWeight.Light,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(start = 16.dp)
            )
            Text(
                text = "$${80.40}",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(start = 16.dp)
            )

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .padding(start = 24.dp)

            ){
                ProductSize(Size = "S")
                ProductSize(Size = "M")
                ProductSize(Size = "L")
                ProductSize(Size = "XL")
            }

        }


        }
}

@Composable
fun ProductSize( Size: String ) {
    Box (modifier = Modifier
        .padding(end = 8.dp)
        .wrapContentWidth()
        .size(48.dp)
        .border(width = 1.dp ,color = Color.DarkGray , shape = CircleShape),
        contentAlignment = Alignment.Center
    ){
        Text(text = Size,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            modifier = Modifier.padding(4.dp)
            )
    }

}

@Preview
@Composable
private fun ProductScreenPrev (){
    ProductScreen(navController = rememberNavController())
}