package OOP
// product info
class Product(val id: Int, val name: String, val price: Double)

// How many item in cart
class CartItem(val pro: Product, var qty: Int = 1) {
    val totalPrice: Double
        get() = qty * pro.price
}
// whole shopping cart list
class ShoppingCart {
    private val items = mutableListOf<CartItem>()

    val finalPrice: Double get() = items.sumOf { it.totalPrice }

    fun addToCart(p: Product, quantity: Int =1) {
        val item = items.find { it.pro.id == p.id }

        if (item != null) {
            item.qty += quantity
        } else {
            items.add(CartItem(p, quantity))
        }
    }

//    fun removeFromCart(productId: Int) {
//        val item = items.find { it.product.id == productId } ?: return
//        if (item.qty > 1) item.qty-- else items.remove(item)
//    }

    fun displayCart() {
        if (items.isEmpty()) {
            println("Your cart is empty")
            return
        }
        println("Shopping List")
        items.forEach {
            println(
                "Product: ${it.pro.name} | Qty: ${it.qty} | " +
                        "Price: ${"%.2f".format(it.pro.price)}$ | " +
                        "Subtotal: ${"%.2f".format(it.totalPrice)}$"
            )
        }
        println("Final Price: ${"%.2f".format(finalPrice)}$")
    }
}

fun main() {
    val apple = Product(1, "Apple", 0.50)
    val bread = Product(2, "Bread", 2.25)
    val milk = Product(3, "Milk", 1.80)

    val cart = ShoppingCart()
    cart.addToCart(apple)
    cart.addToCart(bread)
    cart.addToCart(milk)

    cart.displayCart()

//    println()
//    cart.removeFromCart(apple.id)
//    cart.displayCart()
}






















// Primary constructor គឺជាផ្នែកនៃ header របស់ class ។ វាអាចមានប៉ារ៉ាម៉ែត្រ ហើយអាចប្រើ init block សម្រាប់ initialization ។
//class Product (val id: Int, val name: String,val price: Double,
//               val qty: Int, val dis: Double, val des: String = "deafult description"){
//    init{
//        require(qty >= 1) {"Qty must be greater than 0"}
//        require(price > 0) {"Price must be greater than 0"}
//        println("Shopping List")
//    }
//    // method member
//    fun showData(){
//        println("Id: ${id}, Name: ${name}, Price: ${price}, Qty: ${qty}, Dis: ${dis}, Des: ${des}")
//    }
//}
//fun main(){
//    val pro = Product(id= 1, qty= 1, price= 3.0, name = "coca", dis = 30.0); // name argument
////    val pro2 = Product(1, "coca", 2, 30.0, "Des for coca");  position argument
//    pro.showData();
//}


