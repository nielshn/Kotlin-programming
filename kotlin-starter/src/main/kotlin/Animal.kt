abstract class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
//    var weight: Double = 3.2
//    var age: Int = 2
//    var isMammal: Boolean = true

    open fun eat() {
        println("$name sedang makan")
    }

    open fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    open fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    open fun sleep() {
        println("$name tidur!")
    }
}

class Cat(
    pName: String,
    pWeight: Double,
    pAge: Int,
    pIsCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
) : Animal(pName, pWeight, pAge, pIsCarnivore) {
    fun playWithHuman() {
        println("$name bermain bersama Manusia")
    }

    override fun eat() {
        super.eat()
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }
}

fun main() {
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)
    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)
}

