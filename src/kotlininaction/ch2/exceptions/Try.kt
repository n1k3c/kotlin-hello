package kotlininaction.ch2.exceptions

import java.io.BufferedReader
import java.io.StringReader


fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumberExp(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun main(args: Array<String>) {

    val number = 100
    val percentage = if (number in 0..100) number else throw IllegalArgumentException("Must be in range.")

    val reader = BufferedReader(StringReader("234"))
    println(readNumber(reader))

    val reader2 = BufferedReader(StringReader("Not a number"))
    readNumberExp(reader2)
}