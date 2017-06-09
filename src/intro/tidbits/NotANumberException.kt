package intro.tidbits

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by nikola on 6/8/17.
 */

class NotANumberException(message: String) : Throwable(message) {

}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Float, Double -> throw NotANumberException("Not a number")
    }
}

fun main(args: Array<String>) {

    try {
        checkIsNumber("String")
    } catch (e: IllegalArgumentException) {
        println("Do nothing!")
    }
    catch (e: NotANumberException) {
        println("${e.message}")
    }

    val buffer = BufferedReader(FileReader("text.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println("Hendlamo exception")
    } finally {
        println("Closing")
        buffer.close()
    }
    println(result)

}