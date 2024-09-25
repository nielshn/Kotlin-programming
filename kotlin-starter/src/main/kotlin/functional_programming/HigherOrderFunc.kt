package functional_programming

/*
* Higher Order Function: A Function that using another function as parameter, to be a return type or both
* Inline: memungkinkan untuk menyertakan seluruh kode dari suatu fungsi / lambda expression pada saat kompilasi, therefor
* mempercepat waktu eksekusi program
* */
fun main() {
    // lambda as argument/parameter func
    printResult(10) { value ->
        value + value
    }

    printMessage("Dicoding") { name ->
        "Hello $name"
    }
}

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

//val sum: (Int) -> Int = { value -> value + value }

inline fun printMessage(name: String, message: (String) -> String) {
    print(message(name))
}