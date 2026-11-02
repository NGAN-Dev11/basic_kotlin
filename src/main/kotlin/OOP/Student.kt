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
// Sample Class Object
class Student{
    private var _name : String = ""
    private var _score : Double = 0.0

    var name : String
        get() = _name

        set(name){
            _name = name
        }

    var score : Double
        get() = _score
        set(score){
            _score = score
        }
    fun displayStudent(){
        println("Name: $name | score: $_score")
    }
}


fun main(){
    // Object from class Person
    val p = Person()
    p.displayPerson()

    val stu = Student()
    stu.name = "Dara"
    stu.score = 10.0

    stu.displayStudent()
}