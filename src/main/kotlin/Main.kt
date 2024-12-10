package org.example


fun main() {
    calculateAvailableSpace()
}

//"This code block is an example of val being read-only, not immutable."
class Box {
    var width: Int = 20
    var height: Int = 40
    var lenght: Int = 50
    var usedSpace: Int = 0


    val avaliableSpace: Int
        get() {
            return (width * height * lenght) - usedSpace
        }

}

fun calculateAvailableSpace() {
    val box = Box()
    box.height = 10
    box.width = 20
    box.lenght = 5
    box.usedSpace = 2
    println(box.avaliableSpace)

    box.height = 30
    box.width = 10
    box.lenght = 8
    box.usedSpace = 0
    println(box.avaliableSpace)
}

//Convert a var variable to val.
class User {
    val name: String = "Mert"
    var surName: String = "BABACAN"
        private set
}

fun testUser() {
    val user = User()

//"The following codes will not work."

    user.name = "Mehmet"
    user.surName = "ASLAN"
}