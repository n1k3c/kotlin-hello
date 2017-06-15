package advanced.functions

/**
 * Created by nikola on 6/11/17.
 */

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {

    "Hello".shouldBeEqualTo("Hello")

    val output = "Hello"
    output shouldBeEqualTo "Hello"



}
