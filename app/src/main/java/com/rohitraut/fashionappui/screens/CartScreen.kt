import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
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
import com.rohitraut.fashionappui.data.CartItem
import com.rohitraut.fashionappui.data.cartItemsSample

@Composable
fun CartScreen(navController: NavController) {
    val cartItems = remember { mutableStateListOf(*cartItemsSample.toTypedArray()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        // Header
        Text(
            text = "Shopping Cart",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
        )

        if (cartItems.isEmpty()) {
            // Empty Cart UI
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Your cart is empty!",
                    fontSize = 18.sp,
                    color = Color.Gray
                )
            }
        } else {
            // Product List
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(cartItems) { item ->
                    CartItemCard(item = item, onRemove = { cartItems.remove(item) })
                }
            }

            // Footer
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
//                val totalPrice = cartItems.sumOf { it.price * it.quantity }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Total:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "$34567",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Button(
                    onClick = {
                        // Navigate to checkout or perform action
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF509790),
                        contentColor = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Proceed to Checkout", fontSize = 18.sp)
                }
            }
        }
    }
}

@Composable
fun CartItemCard(item: CartItem, onRemove: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Product Image
            Image(
                painter = painterResource(id = item.image),
                contentDescription = item.name,
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 16.dp)
            )

            // Product Details
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = item.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "$${item.price}",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
                Text(
                    text = "Qty: ${item.quantity}",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }

            // Remove Button
            Icon(
                imageVector = Icons.Filled.Delete,
                contentDescription = "Remove Item",
                modifier = Modifier
                    .size(24.dp)
                    .clickable { onRemove() },
                tint = Color.Red
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {
    CartScreen(navController = rememberNavController())
}
