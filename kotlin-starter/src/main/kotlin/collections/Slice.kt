package collections
// Slice: menyaring item tertentu di dalam object collection
fun main(args: Array<String>) {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)
    println(slice)

    // menentukan posisi yang lebih spesifik
    val index = listOf(2,3,5,8)
    val slice2 = total.slice(index)
}