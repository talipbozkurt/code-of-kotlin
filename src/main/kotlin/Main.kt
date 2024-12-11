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

    // user.name = "Mehmet"
    // user.surName = "ASLAN"
}


//Nullable and Null

//val number : Int= null -> Kotlin, we cannot assign null to a variable by default. We need to append a ? orr !! to the data type to allow null values.

//"A variable can be assigned a null value,
// but if null is assigned,
// the code will not execute.
var number1: Int? = null
var number2: Int? = null

//A variable can be assigned a null value.
// However, if its null status is not checked and the variable is null,
// the code will still execute.

var result: Int? = 0
result!!.plus(other:324)

//   NUMBER

val longNumber = 1586L // There's no 'l' in lowercase, because in some fonts it looks similar to '1'.
val floayNumber = 19.90F // We used 'F' so that type inference doesn't occur. We told the IDE that it's a float.
val floatnumber2 = 13f
val doubleNumber = 3.14e10 //scientific notation
val decimalNumber = 0197

//val octalNumber = 0197  Doesenr work , not supported
val hexaDecimalNumber = 0x759
val binerayNumber = 0b01000011







