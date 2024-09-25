package collections

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    val evenList = numberList.filter { it % 2 == 0 }

    println(evenList)
    println(notEvenList)

    // map() operation: create new collection
    val multipliedBy = numberList.map { it * 5 }
    println(multipliedBy)

    // count() operation
    println(numberList.count())
    println(numberList.count { it % 3 == 0 })

    // find(), firstOrNull(), lastOrNull()
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firsOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val moreThan10 = numberList.first { it > 8 }
    print(moreThan10)
    println(firstOddNumber)
    println(firsOrNullNumber)

    // sum operation
    val total = numberList.sum()

    // sorted operation
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()
    println(ascSort)
    println(descendingSort)

}