package OOP

class BottleWater {

    val id: Int
    val brand: String
    val amount: Double
    val cap: String
    val md: String
    val exp: String

    // Secondary Constructor 1
    constructor(
        id: Int,
        brand: String,
        amount: Double,
        cap: String,
        md: String,
        exp: String
    ) {
        require(amount > 0) {
            "Amount must be greater than 0"
        }

        this.id = id
        this.brand = brand
        this.amount = amount
        this.cap = cap
        this.md = md
        this.exp = exp
    }

    // Secondary Constructor 2
    constructor(
        id: Int,
        brand: String,
        amount: Double,
        cap: String,
        md: String,
    ) : this(
        id,
        brand,
        amount,
        cap,
        md,
        "2027-10-30"
    )

    // Member Function
    fun showData() {
        println("ID: $id")
        println("Brand: $brand")
        println("Amount: $amount")
        println("Capacity: $cap")
        println("Manufacturing Date: $md")
        println("Expiry Date: $exp")
        println("----------------------------")
    }
}

fun main() {

    // Using Secondary Constructor 1
    val water1 = BottleWater(
        1,
        "Vital",
        0.50,
        "500ml",
        "2026-10-14",
        "2027-10-14"
    )
    val water2 = BottleWater(2, "dasani", 1.0, "500ml", "2027-10-14")

    water1.showData()
    water2.showData()
}
