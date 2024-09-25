package functional_programming
/*
* SCOPE FUNCTION WITH LAMBDA RECEIVER
* run(): return value berdasarkan expression yang berada di dalam block lambda using receiver (this).
* with():mengakses apa yang menjadi anggotanya tanpa harus menyediakan return value
* apply(): dapat melakukan inisialisasi or configuration dari receiver-nya.
* */


/*
* SCOPE FUNCTION WITH LAMBDA ARGUMENT
* let(): using argument (it) founded in nullable object
* also(): return value adalah konteks object, digunakan saat ingin menggunakan konteks dari objek sebagai argumen without changes the value
* */
fun main() {

    // run scope func
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result: $result")

    // with()
    val message = "Hello Kotlin"
    val hasil = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(hasil)

    // apply()
    val message2 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin")
    }
    println(message2.toString())

    // let()
    val message3: String? = null
    message3?.let {
        val length = it.length * 2
        val text2 = "text length $length"
        println(text2)
    } ?: run {
        val text2 = "message is null"
        println(text2)
    }

    // also()
    val result2 = message.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result2")
}