package advanced.functions

/**
 * Created by nikola on 6/11/17.
 */

inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun op() {
    val numbers = 1..100

    // We can return in lambdas (must be inline fun)
    numbers.myForEach {
        if (it % 5 == 0) {
            return@myForEach
        }
    }
    println("Hello!")

    // We can return in anonymous function. Return works
    // for the nearest function
    numbers.forEach (fun (element) {
        if (element % 5 == 0) {
            return
        }
    })
    println("Hello 2!")
}

fun main(args: Array<String>) {

    op()
}