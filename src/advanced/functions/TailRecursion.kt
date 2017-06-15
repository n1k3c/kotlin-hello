package advanced.functions

/**
 * Created by nikola on 6/11/17.
 */

fun factorial(number: Int): Int {
    when (number) {
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}

// Last call must be function itself (== tail recursion)
// 'tailrec' optimize recursive function (transform call with a loop)
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    when (number) {
        0 -> return accumulator
        else -> return factorialTR(number - 1, accumulator * number)
    }
}

fun main(args: Array<String>) {

    println(factorial(5))
    println(factorialTR(5))
}