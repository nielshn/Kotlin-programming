import kotlin.random.Random

fun main() {
    val name = "Kotlin"

    println("Hello, $name")

    for (i in 1..5)
        println("i = $i")

    // variable immutable
    val valueA = 10
    val valueB = 20

    println(valueA + valueB)

    // data type char
    var vocal = 'A'

    val text = "Dicoding"
    val firstChar = text[3]

    print("The 4th character of the $text is $firstChar")

    for (char in text) {
        print("$char")
    }
    println()
    // raw string
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)

    // if expressions
    val openHours = 7
    val now = 20
    val office: String = if (now > 7) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    // Array
    val array = arrayOf(1, 3, 5, 7, "Dicoding", true)
    val intArray = intArrayOf(1, 2, 7, 6)
    println(intArray[2])

    intArray[2] = 11
    print(intArray[2])

//    nullable types
    var string: String? = "Dicoding"
    if (string != null) { // smart cast
        print(string.length)
    }
    var obj: Any = "Dicoding"

    if (obj is String) {
        println("String length is ${obj.length}")
    }

    // safe calls operator (?.)
    val test: String? = null
    test?.length

    // When expression
    val value = 7
    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        else -> println("value cannot be reached")
    }

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51 .. 100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

    // Range
    val rangeInt = 1..10
    val downInt = 10.downTo(1) // reverse value sorting
    // Checking is the value there in range value
    if (7 in downInt){
        println("value 7 available")
    }


    // For Loop
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges){
        println("value is $i")
    }

    for ((index, value) in ranges.withIndex()){
        println("value $value with index $index")
    }

    // Break and Continue
    loop@ for (i in 1..10){
        println("Outside Loop")

        for (j in 1..10){
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }
    val x = 11
    when (x) {
        10, 11 -> print("a")
        11, 12 -> print("b")
    }

    // OOP Paradigm
//    val dicodingCat = Animal()
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}," +
//            "mamalia: ${dicodingCat.isMammal}")
//    dicodingCat.eat()
//    dicodingCat.sleep()
//
//    // Mengubah Properti dari class dicodingCat
//    dicodingCat.name = "Kucing Oren"
//    dicodingCat.weight = 6.0
//    dicodingCat.age = 3
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}," +
//            "mamalia: ${dicodingCat.isMammal}")
//    dicodingCat.eat()
//    dicodingCat.sleep()

    // LATE INIT & LAZY Property
    lateinit var nama: String
    nama = "Dicoding Miaw"

    // Lateinit should be paired with keyword var and can't val
//    // while lazy property must be paired with keyword val for only once initialisation
//    // check initialized variable
//    if (::nama.isInitialized)
//        print(name.length)
//    else
//        print("Not Initialized")
}
fun getRegisterNumber() = Random.nextInt(100)