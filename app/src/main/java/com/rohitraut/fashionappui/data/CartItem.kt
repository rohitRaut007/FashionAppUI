package com.rohitraut.fashionappui.data

import com.rohitraut.fashionappui.R

// Sample data for cart items
data class CartItem(val image: Int, val name: String, val price: Float, var quantity: Int)

val cartItemsSample = listOf(
    CartItem(R.drawable.profile_1, "Summer Outfit", 80.40f, 1),
    CartItem(R.drawable.profile_2, "T-shirt", 40.10f, 2),
    CartItem(R.drawable.profile_3, "Jeans", 50.20f, 1)
)

