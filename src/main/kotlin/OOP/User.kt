package OOP
import kotlin.random.Random

open class User {
    val id: Int
    val u_id: String
    val username: String
    val email: String
    val password: String

    // secondary constructor
    constructor(id: Int, username: String, email: String, password: String) {
        this.id = id
        this.u_id = generateUId()
        this.username = username
        this.email = email
        this.password = password
    }

     open fun display(){
        println("ID: $id")
        println("UID: $u_id")
        println("Username: $username")
        println("Email: $email")
        println("Password: $password")
        println()
    }
    private fun generateUId(): String = "U-${Random.nextInt(10000, 100000)}"
}



//fun main(){
////     empty list
//    val users = mutableListOf<User>()
//
////     create object
//    users.add(User(1, "Dara", "dara@gmail.com", "123"))
//    users.addAll(
//        mutableListOf(
//            User(2, "Sokha", "sokha@gmail.com", "321"),
//            User(3, "Bob", "bob@gmail.com", "123"),
//            )
//    )
//
////     new list
//    val newUsers = mutableListOf<User>(
//        User(4, "Franco", "franco@gmail.com", "321"),
//        User(5, "Nana", "nana@gmail.com", "123"),
//    )
//    newUsers.forEach { it -> users.add(it) }
//    users.forEach { u-> u.display() }
//    println("Total Users: ${users.count()}")
//}


