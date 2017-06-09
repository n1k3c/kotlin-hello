package hello

/**
 * Created by nikola on 5/19/17.
 */

fun main(args: Array<String>) {
    var list = listOf<Int>(1, 2, 3, 4, 5)

    var filter = list.map { it * 2}

    filter.forEach { x -> println("$x") }

    println("---------------------")

    for (n in filter) {
        println("$n")
    }
}