package com.rohitraut.fashionappui.data

import com.rohitraut.fashionappui.R

data class WishlistItem(val image: Int, val name: String, val price: Float)

val wishlistItems = listOf(
    WishlistItem(R.drawable.profile_1, "Summer outfit", 80.40f),
    WishlistItem(R.drawable.profile_2, "T-shirt", 40.10f),
    WishlistItem(R.drawable.profile_3, "Jeans", 50.20f),
    WishlistItem(R.drawable.profile_4, "Denim Jacket", 140.00f),
    WishlistItem(R.drawable.profile_5, "Crop Top", 107.50f)
)
