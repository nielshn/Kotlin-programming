enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color -> print("$color ") }

    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")

//    Getting list of object enum and name of object enum
    val colors2: Array<Color> = enumValues()
    colors.forEach { color ->
        println(color)
    }
    val color2: Color = enumValueOf("RED")
    println("Color is $color")

//    Get position of enum's object
    val position: Color = Color.GREEN
    print("Position GREEN is ${color.ordinal}")
}