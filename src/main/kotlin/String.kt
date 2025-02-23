fun main() {
    val name = "Kotlin"
    val char1 = 'K'
    val char2 = 'o'
    val char3 = 't'
    val char4 = 'l'
    val char5 = 'i'
    val char6 = 'n'

    val nameArray = charArrayOf(char1, char2, char3, char4, char5, char6)

    for (char in name) {
        println(char)
    }

    val firstCharacterOfName = name[name.indices.first] //name.first()
    val firstCharacterOfName2 = name[1]
    val lastCharacterOfName = name[name.indices.last]  //name.last()
    val lastCharacterOfName2 = name[5]  //name[name.length-1]
    println("$firstCharacterOfName $firstCharacterOfName2 $lastCharacterOfName  $lastCharacterOfName2")


}