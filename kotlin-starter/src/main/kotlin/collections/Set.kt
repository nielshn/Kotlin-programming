package collections

// Set: collection yang hanya dapat menyimpan nilai unik.
fun main(args: Array<String>) {
    val setA = setOf(1, 2, 4, 2, 1, 5)
    println(setA)

//    check value of set
    println(5 in setA)

//    union and intersect func: gabungan dan irisan 2 set.
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)
    println(union)
    println(intersect)

    val numbers = setOf("one", "two", "three")
    val numbers2 = setOf("three", "four")

// merge differences
    println((numbers - numbers2) union (numbers2 - numbers))
// [one, two, four]
}