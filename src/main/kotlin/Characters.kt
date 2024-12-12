fun main() {
    val exampleString =
        "Examples of escape characters in Kotlin:\n" +
                "\t \\t You can add a space with tab.\n" +
                "\t \\n You can move to a new line.\n" +
                "\t \\b You can perform a backspace operation.\n" +
                "\t \\r You can move to the beginning of the line.\n" +
                "\t \\' You can use a single quote (') character.\n" +
                "\t \\\" You can use a double quote (\") character.\n" +
                "\t \\\\ You can use a backslash (\\) character.\n" +
                "\t \\\$ You can use a dollar sign ($) character."

    println(exampleString)


    // Examples of unicode
    val blackHeart = '\u2665'
    val heavyBlackHeart = '\u2764'

    println(" \n First commit with $blackHeart") // ♥
    println(" \n First commit with $heavyBlackHeart") // ❤

    val ANSI_RED = "\u001B[31m"
    val ANSI_RESET = "\u001B[0m"

    println(" \n First commit with $ANSI_RED$blackHeart$ANSI_RESET ")

}

