package com.rohitraut.fashionappui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rohitraut.fashionappui.R
import com.rohitraut.fashionappui.Screen
import kotlin.math.sin

@Composable
fun DashboardScreen (navController:NavController) {
    val searchState = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .zIndex(2.0f)

            ) {
                Text(
                    text = "Experience \n The Difference",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp, bottom = 24.dp)
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(start = 24.dp, end = 24.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(48.dp)
                        )
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(48.dp)
                        )

                ) {
                    BasicTextField(value = searchState.value,
                        onValueChange = { searchState.value = it },
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .padding(16.dp),
                        singleLine = true,
                        decorationBox = { innerTextField ->
                            if (searchState.value.isEmpty()) {
                                Text(
                                    text = "Search",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .fillMaxHeight()
                                )
                            } else {
                                innerTextField()
                            }
                        }

                    )

                    Image(
                        painter = painterResource(R.drawable.ic_search),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxHeight()
                            .size(38.dp)
                            .padding(end = 10.dp)
                    )

                }
            }

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .weight(1f)
                    .offset(y = (-24).dp)
                    .zIndex(1f)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(android.graphics.Color.parseColor("#CBEBF7")),
                                Color(android.graphics.Color.parseColor("#F9F7F6"))
                            )
                        )
                    )
                    .padding(start = 16.dp)
            ) {
                item {
                    ProductView(
                        image = R.drawable.profile_1,
                        name = "Summer outfit",
                        price = 80.40f,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController

                    )
                }
                item {
                    ProductView(
                        image = R.drawable.profile_2,
                        name = "t-shirt",
                        price = 40.10f,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController

                    )
                }
                item {
                    ProductView(
                        image = R.drawable.profile_5,
                        name = "Crop",
                        price = 107.50f,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController

                    )
                }
                item {
                    ProductView(
                        image = R.drawable.profile_4,
                        name = "Demin",
                        price = 140.00f,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController

                    )
                }
                item {
                    ProductView(
                        image = R.drawable.profile_3,
                        name = "Jeans",
                        price = 50.20f,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController

                    )
                }
                item {
                    ProductView(
                        image = R.drawable.profile_6,
                        name = "Leather",
                        price = 107.80f,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController

                    )
                }

            }

        }

        // navigation
        Column (modifier = Modifier
            .fillMaxWidth()
            .size(52.dp)
            .align(Alignment.BottomCenter)
            .background(Color.White,
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
            )
            .padding(top = 8.dp, end = 8.dp)
        ){
            Row (modifier = Modifier.fillMaxWidth()
                .padding(bottom = 4.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)

                )
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
                Icon(
                    imageVector = Icons.Outlined.AddCircle,
                    tint = Color(android.graphics.Color.parseColor("#509790")),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)

                )
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)

                )

            }
        }
    }
}

@Composable
fun ProductView(
    image: Int,
    name: String,
    price: Float,
    navController: NavController,
    modifier: Modifier = Modifier
){
    ElevatedCard (
        modifier = modifier.clickable (interactionSource = remember {
            MutableInteractionSource()
        },
            indication = null
        )
        {
            navController.navigate(Screen.Product.route)

        },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        shape = RoundedCornerShape(
            topStart = 122.dp,
            topEnd = 122.dp,
            bottomStart = 8.dp,
            bottomEnd = 8.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column {
            Image(painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            topStart = 122.dp,
                            topEnd = 122.dp
                        )
                    )
            )

            Text(
                text = name,
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Text(
                text = "$$price",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, bottom = 8.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )


        }
    }
}

@Preview
@Composable
private fun DashboardScreenPrev() {
    DashboardScreen(navController = rememberNavController())

}