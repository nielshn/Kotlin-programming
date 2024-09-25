//DESC: Singleton object: pattern to make sure suatu object hanya memiliki one instance with one point access global
// marked with keyword object
object CentralLibrary {
    fun borrowBookId(id: Int){
        print("Book with $id has been borrowed")
    }
}

// Companion object: membuat inner object directly in class. Can also use to make constanta (const val).
class Library {
    companion object{
        fun  borrowBookById(id: Int){
            println("Book with $id has been borrowed")
        }
    }
}

// Companion object in constanta writing
class MyLibrary {
    // Const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook(){
        print("Total book in $LIBRARY_NAME is unlimited")
    }
    companion object{
        const val LIBRARY_NAME = "Dicoding Library"
    }
}

// Anonymous Class: class without name (langsung definisikan isi dari class dengan keyword object.
interface IFly{
    fun fly()
}

fun flyWIthWings(bird: IFly){
    bird.fly()
}

// Single Abstract Method (SAM) Interface: Interface yang memiliki member satu fungsi saja.
// Meringkas implementation function interface tanpa harus typing override many times (fun interface).

fun interface IRun{
    fun run()
}
fun runWithFeet(lion: IRun){
    lion.run()
}
fun main() {
    // singleton object
    CentralLibrary.borrowBookId(21)
    // companion object
    Library.borrowBookById(21)
    // companion object in constanta writing
    val name = MyLibrary.LIBRARY_NAME
    println(name)

//    Anonymous class
    flyWIthWings(object : IFly{
        override fun fly() {
            println("The Bird flying")
        }
    })

    // SUM Interface
    runWithFeet{
        println("The Lion running")
    }

}