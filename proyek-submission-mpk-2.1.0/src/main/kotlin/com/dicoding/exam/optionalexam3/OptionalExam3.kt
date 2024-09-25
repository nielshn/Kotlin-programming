package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberRegex = "\\d+".toRegex()
    val matches = numberRegex.findAll(str).map { it.value.toInt() }.toList()

    return if (matches.isNotEmpty()){
        val total = matches.sum() * int
        str.replace(numberRegex, total.toString())
    }else{
        str + int
    }
}
