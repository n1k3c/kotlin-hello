package kotlininaction.ch3.extensions

infix fun Any.to(other: Any) = Pair(this, other)

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val (number, name) = 1 to "one"

    println(number)
}