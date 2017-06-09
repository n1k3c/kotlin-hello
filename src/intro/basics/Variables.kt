package intro.basics

/**
 * Created by nikola on 6/2/17.
 */

fun main(args: Array<String>) {

    var streetNumber: Int
    var streetName = "High street"

    val zip = "E11 P1"

    streetName = "Pudding Lane"

    // zip = "SW1 ES2"

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    val myLongAgain: Long = myInt.toLong()

    // String

    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new line \n"

    val rawString = "Hello" +
            "This is a second line" +
            "Third line"

    val multipleLines = """
            This is a string
            This is a new line
            """

    val years = 10
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"

}