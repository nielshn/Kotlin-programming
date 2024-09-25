//package functional_programming
//
///*
//* REFERENCES: using operator :: sebagai instances dari function type.
//* */
//
//// Properti global
//val message = "Kotlin"
//
//fun main() {
//    // function references
//    val numbers = 1..10
//    val evenNumbers = numbers.filter(::isEvenNumber)
//    println(evenNumbers)
//
//    // extension reference
//    val evenNumbers2 = numbers.filter(Int::isEvenNumber)
//    println(evenNumbers2)
//
//    // properti reference
//    println(::message.name)
//    println(::message.get())
//
////    ::message.set("Kotlin academy") <- Error: Unresolved reference
//    println(::message.get())
//}
//
//// Fungsi global untuk memeriksa bilangan genap
//fun isEvenNumber(number: Int) = number % 2 == 0
//
//// Ekstensi untuk tipe Int
//fun Int.isEvenNumber() = this % 2 == 0
