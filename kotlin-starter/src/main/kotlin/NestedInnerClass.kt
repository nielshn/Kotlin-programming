class House {
//    Outer class property
    val buildingArea = 100
//   case if name of outer class property and inner class property are same -> use qualified this
    val totalRooms = 4
    inner class Room {
        val totalRooms = 4
        fun measureRoomArea() {
//            Inner class is able to access outer class property
            print(buildingArea/this@House.totalRooms)
        }
    }
}

fun main() {
    val house = House();
    val room = house.Room()
    room.measureRoomArea()
}