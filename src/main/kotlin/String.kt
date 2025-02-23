import java.util.*

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

    val numberValue: String = "value" + (4 + 2 + 8) // value14 , string ,because of the + operator
    //val numberValue2 : String = (4+2+8) + "value"  //doesn't work
    // val numberValue3 : String = (4+2+8).plus("value") //doesn' work

    println("numberValue : " + numberValue)  // bad practice / java habit
    println("numberValue : $numberValue") // templete usage
    println("numberValue lenght : ${numberValue.length}")// using property in string

    /* Multiline String ( """ ) */
    val rawPineTree = """"
      *
 $   ***
    *****
    """.trimIndent()

    val rawPineTree2 = """"
      *
 $   ***
    *****
    """.trimMargin(marginPrefix = "$")

    val rawPineTree3 = """"
      *
 $   ***
    *****
    """.trimIndent()


    println(rawPineTree)
    println(rawPineTree2)
    println(rawPineTree3)


    /*val price = """
        Price \$_9.99
        """ */  // Escape character doesn't work in multiline String

    val price2 = """
        Price ${'$'}_9.99
        """
    val age = 21
    val message = String.format("Age : %d", age)
    println(message) // Age : 21
    val height = 1.7441848
    val heightMessage = String.format("Height : %.2f meter ", height)
    println(heightMessage) // Height : 1.74

    val numb: Double = 121313134.3131
    val usFormat = String.format(Locale.US, " format of US : %,.2f", numb)
    println(usFormat)
    val localeTR = Locale("tr", "TR") // Doğru Locale oluşturma yöntemi
    val trFormat = String.format(localeTR, " format of TR : %,.2f", numb) // Değişken adı düzeltildi
    println(trFormat)
}