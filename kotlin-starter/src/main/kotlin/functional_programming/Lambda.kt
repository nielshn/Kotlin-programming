package functional_programming

/*
* Lambda Expression (Anonymous Func): has parameters list, body, return type ->
* val message: (String) -> String = { name: String -> {
* "Hello $name"
* }
* */

fun main() {
    message()
    printMessage("Hello from Lambda!")
    val length = messageLength("Hello From lambda")
    println("Message length $length")

//    looping in lambda
    val ranges = 1..10 step 3
    ranges.forEach { value ->
        println("value is $value")
    }

//    using extension foreachIndexed
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}

val message = { println("Hello From Lambda") }
// Adding parameter to lambda
val printMessage = {message: String -> println(message) }
// How to return value in lambda
val messageLength = {message: String -> message.length}

//