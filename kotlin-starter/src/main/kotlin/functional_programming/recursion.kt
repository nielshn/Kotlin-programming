package functional_programming

tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
       factorial(n-1, newResult)
    }
}

fun main() {
    println("Factorial 9999 is: ${factorial(9999)}")

//    val total = listOf(1, 2, 3, 4, 5, 6)
//
//    val result1 = total.take(5)
//    val result2 = result1.takeLast(4)
//    val result3 = result2.drop(1)
//    val result4 = result3.dropLast(2)
//
//    println(result4)

}