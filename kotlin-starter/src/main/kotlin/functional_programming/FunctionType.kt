package functional_programming
/*
* Type Alias: Digunakan ketika sebuah function type yang sama
* invoke(): menggunakan instance dari function type
* bisa juga menandai function sebagai nullable dengan tanda safe call ?
* typealias Arithmetic = ((Int, Int) -> Int) ?
* */
typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = {valueA, valueB -> valueA + valueB}
    val multyply: Arithmetic = {valueA, valueB -> valueA * valueB}

    val sumResult = sum.invoke(10, 10)
//    val multiplyResut = multyply.invoke(20, 20)
    val multiplyResut = multyply(20, 20) // directly
    println(sumResult)
    println(multiplyResut)
}