package OOP
class Person{
    // data member
     var name : String = "Dara"
     var age : Int = 18
     var gender : String = "Male"

    // Method Member
    fun displayPerson(){
        println("Name: $name | age: $age | Gender: $gender")
    }
}
class Student{
    private var _id : Int? = null
    private var _name : String = ""
    private var _gender : String = ""
    private var _score: Double = 0.0
    private var _gpa: Double = 0.0

    var id: Int
        get() = _id!!
        set(id) {
            _id = id
        }

    var name: String
         get() = _name
        set(name) {
            _name = name
        }

    var gender : String
    get() = _gender
    set(gender) {
        _gender = gender
    }

    var score: Double
    get() = _score
    set(score) {
        _score = score
    }

    var gpa: Double
    get() = _gpa
    set(gpa) {
        _gpa = gpa
    }

    // method member
//    fun displayStudent(){
//        println("ID: $_id | Name: $_name | Gender: $_gender | Score: ${"%.2f".format(score)}" +
//                "| GPA: ${"%.2f".format(gpa)}")
//    }
}

fun main(){
    // Object from class Person
    val p = Person()
    p.displayPerson()

    // object from class student
    val stu = Student()
//    stu.id = 1;
    stu.name = "Dara"
    stu.gender = "Male"
    stu.score = 90.0;
    stu.gpa = 3.80
    println("ID: ${stu.id} | Name: ${stu.name} | Gender: ${stu.gender} | Score: ${"%.2f".format(stu.score)}" +
                "| GPA: ${"%.2f".format(stu.gpa)}")

//    stu.displayStudent()

}