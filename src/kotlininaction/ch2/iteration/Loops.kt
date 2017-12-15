package kotlininaction.ch2.iteration

import java.util.*

fun fizzBuz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 5 == 0 -> "Fizz "
    i % 3 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 1..100) print(fizzBuz(i))

    for (i in 100 downTo 1 step 2) print(fizzBuz(i))

    binary()
}

fun binary() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}




