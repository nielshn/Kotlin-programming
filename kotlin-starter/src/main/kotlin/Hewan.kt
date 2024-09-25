class Hewan(pName: String, pWeight: Double, pAge: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        weight = if (pWeight < 0) 0.1 else pWeight
        age = if (pAge < 0) 0 else pAge
        name = pName
        isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = Hewan("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Hewan("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}