package kotlininaction.ch3

val set = setOf(1, 7, 52)
val map = mapOf(1 to "one", 7 to "seven", 52 to "fifty-two")
val strings = listOf("first", "second", "fourtheenth")
val numbers = setOf(1, 3, 45)

fun main(args: Array<String>) {
    println(set.javaClass)
    println(map.javaClass)

    println(strings.last())
    println(numbers.max())
}