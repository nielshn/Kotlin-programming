package collections

// Fold: melakukan perhitungan setiap nilai di dalam sebuah collection tanpa melakukan iterasi
// Drop:memangkas item yang berada di dalam object collection berdasarkan jumlah yang ditentukan
// Take: Menyaring item yang berada di dalam object collection
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    val foldRight = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")
    println("Fold result: $foldRight")

    // Drop
    val drop = numbers.drop(3)

    // take()
    val take = numbers.take(3)
}
