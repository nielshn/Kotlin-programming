package collections

fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"])
    println(capital.getValue("London"))

    val mapKeys = capital.keys
    println(mapKeys)

//    change map capital to become mutable map
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)
}