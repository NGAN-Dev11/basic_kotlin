package collection_lesson

fun main(){
    // Immutable map
    val student = mapOf(
        1 to "John Smith",
        2 to "Jane Smith",
        3 to "Mary Smith",
        4 to "May Smith",
        5 to "Jay Smith",
        6 to "May Smith",
        7 to "Jay Smith",
        8 to "May Smith",
        9 to "Jay Smith",
        10 to "Jame Smith",
    )

    println("Student: $student")
    println("${student.keys}")
    println("${student.values}")

    // Accessing value
    println("Student Id 1: ${student[1]}")
    println("Student Id 2: ${student.get(3)}")
    println("Student Id 11: ${student.getOrDefault(11, "Unknown")}")

    // check contain
    println("Contain key: ${student.containsKey(11)}")
    println("Contain Value: ${student.containsValue("Jame Smith")}")

    // Mutable Map
    val mutableScore = mutableMapOf(
        "Jane Smith" to 100,
        "Mary Smith" to 90,
        "May Smith" to 80,
        "Jay Smith" to 70,

    )

    println("Score: $mutableScore")
    mutableScore["Jame bond"] = 80
    // update
    mutableScore["May Smith"] = 89
    mutableScore.put("Unknown", 90)
    mutableScore.remove("Unknown")

    for((name, score) in mutableScore){
        println("$name and Score $score")
    }
    // entries ប្រើសម្រាប់យក key + value ទាំងពីរ ចេញពី Map ម្តងតែមួយ
    /*
    entries ក្នុង Map
        - ប្រើសម្រាប់យក Key និង Value ទាំងពីរ ជាគូ។
        - map.entries នឹង return ជា collection របស់ Map.Entry។
        - Entry នីមួយៗមាន៖ entry.key និង entry.value
     */
    val entries = mutableScore.entries
    println("entries: $entries")


    println("Score: ${mutableScore["May Smith"]}")
    println("Score: ${mutableScore["Jay Smith"]}")

    for (entry in mutableScore.entries) {
        println("Name: ${entry.key}, Score: ${entry.value}")
    }

    val highScorers = mutableScore.filter { it.value >= 80 }
    println("High scorers: $highScorers")

    val upperCaseNames = mutableScore.map { it.key.uppercase() to it.value }
    println("Uppercase names: $upperCaseNames")

    // Default value with Elvis
    val unknownScore = mutableScore["Dara"] ?: 0
    println("Unknown score: $unknownScore")

}