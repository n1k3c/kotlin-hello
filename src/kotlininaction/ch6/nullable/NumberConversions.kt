package kotlininaction.ch6.nullable

fun foo(l: Long) = println(1)

fun main(args: Array<String>) {
    val i = 1
    val l: Long = i.toLong()

    val x = 1
    val list = listOf(1L, 2L, 3L)
    println(x.toLong() in list)

    val b: Byte = 1
    val k = b + 1L

    foo(k)

}