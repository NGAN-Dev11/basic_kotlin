package OOP
class Admin
    (id: Int, username: String, email: String, password: String, val adminLevel : Int)
    : User(id, username, email, password) {

    override fun display() {
        super.display()
        println("Admin Level: $adminLevel")
    }

    }

class UserManager{
    private val users = mutableListOf<User>()

    // can add only 1 by 1
    fun addUser(user: User){
        users.add(user)
    }

    // add multi users
    fun addMultiUsers(newUsers: List<User>){
        users.addAll(newUsers)
    }

    // display all users
    fun displayAllUsers(){
        println("*********[All Users]*********")
        users.forEach { it.display()}
        println("Total users: ${users.count()}")
    }

}

fun main() {
    // create obj from class UserManager
    val userHelper = UserManager()
    userHelper.addUser(User(1, "Dara", "dara@gmail.com", "123"))
    userHelper.addMultiUsers(
        listOf(
            User(2, "Sokha", "sokha@gmail.com", "32231241411"),
            User(3, "Bob", "bob@gmail.com", "123456789"),
            Admin(4, "admin", "franco@gmail.com", "456789012", 1),
            User(5, "Nana", "nana@gmail.com", "password"),
            User(6, "Put", "put@gmail.com", "usernamepass")
        )
    )
    userHelper.displayAllUsers()


}