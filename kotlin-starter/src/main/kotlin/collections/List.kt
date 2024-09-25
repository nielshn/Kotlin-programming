package collections

fun main() {
    val array = arrayOf("Kotlin", "Java")
    array[0] = "Dart" // no error
//    array.add("JavaScript") // error

    val list = listOf("Kotlin", "Java")
//    list[0] = "Dart" // error
//    list.add("JavaScript") //error

    val mutableList = mutableListOf("Kotlin", "Java")
    mutableList[0] = "Dart" // no error
    mutableList.add("JavaScript") // no error

    val arrayList = arrayListOf("Kotlin", "Java")
    arrayList[0] = "Dart" // no error
    arrayList.add("JavaScript") // no error
}

// Array: lebar index sudah tetap sehingga tidak dapat ditambah atau hapus
// List: lebar dan value kontent sudah tetap sehingga tidak dapat diubah-ubah.

//Jika ingin mengubah isi content gunakan MutableList atau ArrayList