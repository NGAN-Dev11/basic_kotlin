package collection_lesson

fun main(){
    val fruits = listOf("banana", "avocado", "apple", "kiwi") //immutable list
    val vechicle = mutableListOf("Car", "Moto", "Bike", "Bus")
    vechicle.add("Train")
    val empty = emptyList<Int>()
    println(fruits.first())
    println(fruits.last())

    println("Fruits: ${fruits[3]}")
    println("Fruits: ${fruits.get(3)}")


    val value = "Banana"
    val subList = fruits.subList(1, 3)
    println("Index Fruits: ${fruits.indexOf(value.lowercase())}")

    // Check if element exists
    println("Contains in Fruits: ${"apple" in fruits}")
    println("Containe in Fruits: ${fruits.contains("apple")}")
    println("Is Empty: ${fruits.isEmpty()}")
    println("Is not empty: ${fruits.isNotEmpty()}")

    val newFruits = fruits.toTypedArray()
    newFruits[0] = "cherry"
    println(newFruits.toList())
    println(fruits.size)
    println(subList)

    for (i in fruits.indices){
        println(fruits[i])
    }

    for (fruit in fruits){
        println(fruit)
    }
}