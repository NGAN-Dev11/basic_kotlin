package collection_lesson
data class Student(
    val name: String,
    val age: Int
)
fun main(){
    val students = setOf(
        Student("Dara", 20),
        Student("Dara", 18),
        Student("Vanna", 20) )
    val groupped = students.groupBy {it.name}
    println(groupped)

    val student1 = Student("John", 35)
    val student2 = Student("John", 35)
    println(student1 == student2)

    // Set គឺជា Collection មួយក្នុង Kotlin ដែលប្រើសម្រាប់រក្សាទុក តម្លៃដែលមិនស្ទួនគ្នា (unique values), unorder (មិនរក្សាលំដាប់ = no index) ។
    val numbers = setOf(1, 2, 3, 4 ,5, 5, 6, 5 ,7)  // Immutable
    println(numbers)

    // mutable set
    val fruits = mutableSetOf("apple", "banana", "orange")
    println("Before adding: $fruits")
    fruits.add("cherry")
    println("After Adding: $fruits")
    fruits.remove("apple")
    println("After removing: $fruits")

    // set operation
    val set1 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val set2 = setOf(9 ,10, 11, 12, 13, 14, 15)
    println("Union: ${set1.union(set2)}")
    println("Intersection: ${set1.intersect(set2)}")
    println("Difference: ${set1.subtract(set2)}")

    println(set1.containsAll(setOf(1, 3, 2, 4, 5)))
    println(set1.contains(1))
    // check membership
    println("Contains 1? ${1 in set1}")

    val listWithDuplicates = mutableListOf(1, 2, 2, 3, 3, 3, 4)

    // converter to set
    val set3 = listWithDuplicates.toMutableSet()
    println(listWithDuplicates)
    println(set3)

    val names = setOf("Dara", "Sok", "Vanna")
    val ages = setOf(20, 18, 22)

    val result = names.zip(ages)
    println(result)



}

