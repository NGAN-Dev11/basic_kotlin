package OOP
// create class
class Student {
    // Data Member
    var name = "";
    var age = 0;

    // Method Member
    fun introduce() = println("Hello my name is $name")
}

fun main(){
    // create object
    val s = Student()
    s.name = "Ann"
    s.introduce();
}