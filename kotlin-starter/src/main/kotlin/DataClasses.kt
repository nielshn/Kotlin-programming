// data class: special class yang hanya menangani data dan memiliki beberapa fungsionalitas seperti
// Constructor, toString(), equals(), hashcode(), copy(), componentN()

//Destructuring declaration: proses memetakan object menjadi sebuah variable.
class User(val name: String, val age: Int)
data class DataUser(val name: String, val age: Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}
fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("Daniel", 21)
    val dataUser4 = dataUser.copy(age = 18) // copy data user and modification

//    Destructuring declaration
//    val name = dataUser.component1()
//    val age = dataUser.component2()
    val (name, age) = dataUser


    println(user)
    println(dataUser)
    dataUser.intro()
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(dataUser4)
    println("My name is $name, I am $age years old")
}

