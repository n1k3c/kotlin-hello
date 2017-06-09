package intro.functions

/**
 * Created by nikola on 6/5/17.
 */

fun hello(): Unit {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This is fun throws exception!")
}

fun returnsFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x * y * z * w

fun printDetails(name: String, email: String = "", phone: String = " ") {
    println("Print details")
}

fun printStrings(vararg strings: String) {
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string  in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {

    hello()

    val value = returnsFour()

    takingString("Some value")

    sum(1, 2, 3)

    sum(1, 2)

    printDetails("hadi", phone="2342", email ="322323232")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")

}