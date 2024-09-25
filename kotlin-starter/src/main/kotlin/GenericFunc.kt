//fun main() {
//    val numbers = (1..100).toList()
//    print(numbers.slice(1..10))
//
//    val names = listOf("dicoding", "academy")
////    names.sumNumber() //
//}

/*
* Constraint Type Parameter
* */

//fun <T : Number> List<T>.sumNumber() : T {
//    /* .. */
//}

// Variance: konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe yang sama
// dan tipe argumen yang berbeda saling berkaitan satu sama lain.

abstract class Vehicle(wheel: Int)
class Car(speed: Int): Vehicle(4)
class MotorCycle(speed: Int): Vehicle(2)

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(100), Car(120))
    val vehicleList = carList

}