package advanced.metaprogramming

/**
 * Created by nikola on 6/15/17.
 */

fun <T> printList(list: List<T>) {

    /*when (list) {
        is List<String> -> println("List of Strings")
        is List<Int> -> println("List of Numbers")
    }*/

    if (list is List<*>) {
        println("This is a list")
    }
}

fun <T> printList(obj: T) {
    when (obj) {
        is Int -> println("This is an Int")
        is String -> println("This is an String")
    }
}

inline fun <reified T> erased(input: List<Any>) {
    if (input is T) {

    }
}

inline fun <reified T> typeInfo() {
    println(T::class)
}

fun main(args: Array<String>) {

    val listStrings = listOf("one", "two", "three")

    val listNumbers = listOf(1, 2, 3)
}