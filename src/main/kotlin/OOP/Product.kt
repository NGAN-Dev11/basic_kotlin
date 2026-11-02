package OOP
// Primary constructor គឺជាផ្នែកនៃ header របស់ class ។ វាអាចមានប៉ារ៉ាម៉ែត្រ ហើយអាចប្រើ init block សម្រាប់ initialization ។
class Product (val id: Int, val name: String,val price: Double,
               val qty: Int, val dis: Double, val des: String = "deafult description"){
    init{
        require(qty >= 1) {"Qty must be greater than 0"}
        require(price > 0) {"Price must be greater than 0"}
        println("Shopping List")
    }
    // method member
    fun showData(){
        println("Id: ${id}, Name: ${name}, Price: ${price}, Qty: ${qty}, Dis: ${dis}, Des: ${des}")
    }
}
fun main(){
    val pro = Product(id= 1, qty= 1, price= 3.0, name = "coca", dis = 30.0); // name argument
//    val pro2 = Product(1, "coca", 2, 30.0, "Des for coca");  position argument
    pro.showData();
}