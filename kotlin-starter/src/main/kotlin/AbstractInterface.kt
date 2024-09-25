abstract class Abstract {
    //    default value not allowed
    abstract val age: Int

    //    default value allowed
    open val isEating = true // optional to be overridden
    val isRespire = true // can not be overridden
}

interface Iwalk {
    //    default value not allowed
    val numberOfLeg: Int // must be overridden
    fun walk() // must be overridden
}

interface IDrink {
}

class Camel : Abstract(), Iwalk, IDrink {
    override val age: Int = 7
    override val isEating: Boolean
        get() = true
    override val numberOfLeg: Int
        get() = 2

    override fun walk() {
        println("Camel can walk")
    }
}

// Extension function: adding new function to a class without need to inherit the class
fun Int.plusThree(): Int {
    return this + 3
}

// Extension Properties
val Int.slice: Int
    get() = this / 2

fun main() {
    val camel = Camel()
    camel.walk()

    println(10.plusThree())
    println(10.slice)

    // infix function
    val result = 5.sum(3)
    val result2 = 5 sum 3
}


// Infix func: simple way to call function (.)
//fun Int.sum(value: Int): Int{
//    return this + value
//}
infix fun Int.sum(value1: Int): Int {
    return this + value1
}