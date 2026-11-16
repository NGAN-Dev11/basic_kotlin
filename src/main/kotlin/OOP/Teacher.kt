package OOP
// Primary Constructor
class Teacher(
      id: Int,
      name: String= "",
      salary: Double = 0.0
    ){
        // public getter / private setter
          var id: Int = id
            private set

        var name: String = name
            private set

        var salary: Double = salary
            private set

    init{
            require(id>0){
                println("ID must be greater than 0")
            }
            require(salary>0){
                println("Salary can't be negative")
            }
    }
    // Customer setter
    fun updateSalary(amount: Double){
        require(amount>0){
            // ! amount >=0 -> <0
            println("Amount must be greater than 0")
        }
        salary = amount
    }

    fun displayTeacher(){
        println("Teacher ID:  $id | Name: $name | Salary: $salary")
    }
}

fun main(){

    val teacher = Teacher(id = 1, name = "Dara", salary = 200.0)
    val teacher1 = Teacher(id = 2, name = "Bob", salary = 200.0)
    teacher.displayTeacher()
    teacher.updateSalary(300.0)
    println("Update Salary: ")
    teacher.displayTeacher()

}