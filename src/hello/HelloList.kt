package hello

/**
 * Created by nikola on 5/22/17.
 */

fun main(args: Array<String>) {

    /*
   We can create a list using the "listOf" function.
   The list will be immutable - elements cannot be added or removed.
   */
    val fooList = listOf("a", "b", "c")
    println(fooList.last())
    // Elements of a list can be accessed by their index.
    println(fooList[0])

    // A mutable list can be created using the "mutableListOf" function.
    val fooMutable = mutableListOf("a", "b", "c")
    fooMutable.add("d")
    println(fooMutable)

    /*
    Sequences represent lazily-evaluated collections.
    We can create a sequence using the "generateSequence" function.
    */
    val fooSequence = generateSequence(1, { it + 1 })
    val x = fooSequence.take(10).toList()
    println(x)

    // An example of using a sequence to generate Fibonacci numbers:
    fun fibonacciSequence(): Sequence<Long> {
        var a = 0L
        var b = 1L

        fun next(): Long {
            val result = a + b
            a = b
            b = result
            return a
        }

        return generateSequence(::next)
    }

    val y = fibonacciSequence().take(10).toList()
    println(y)

    // Kotlin provides higher-order functions for working with collections.
    val z = (1..9).map { it * 3 }
            .filter { it < 20 }
            .groupBy { it % 2 == 0 }
            .mapKeys { if (it.key) "even" else "odd" }
    println(z)

    // A "for" loop can be used with anything that provides an iterator.
    for (c in "hello") println(c)

    // "while" loops work in the same way as other languages.
    var ctr = 0
    while (ctr < 5) {
        println(ctr)
        ctr++
    }
    do {
        println(ctr)
        ctr++
    } while (ctr < 10)

    /*
   "if" can be used as an expression that returns a value.
   For this reason the ternary ?: operator is not needed in Kotlin.
   */
    val num = 5;
    val message = if (num % 2 == 0) "even" else "odd"
    println(message)

    // "when" can be used as an alternative to "if-else if" chains
    val i = 10
    val hello = "helloWorld"

    when {
        i < 7 -> println("block 1")
        hello.startsWith("hello") -> println("block 2")
        else -> println("block 3 - else")
    }

    // "when" can be used with an argument.
    when (i) {
        0, 21 -> println("0 or 21")
        in 1..20 -> println("in range 1 to 20")
        else -> println("else block")
    }

    println()

    // "when" can be used as a function that returns a value.
    val result = when (i) {
        0, 21 -> "0 or 21"
        in 1..20 -> "in the range 1 to 20"
        else -> "none of the above"
    }
    println(result)

    /*
    We can check if an object is a particular type by using the "is" operator.
    If an object passes a type check then it can be used as that type without
    explicitly casting it.
    */
    fun smartCastExample(x: Any) : Boolean {
        if (x is Boolean) {
            // x is automatically cast to Boolean
            return x
        } else if (x is Int) {
            // x is automatically cast to Int
            return x > 0
        } else if (x is String) {
            // x is automatically cast to String
            return x.isNotEmpty()
        } else {
            return false
        }
    }
    println(smartCastExample("Hello, world!")) // => true
    println(smartCastExample("")) // => false
    println(smartCastExample(5)) // => true
    println(smartCastExample(0)) // => false
    println(smartCastExample(true)) // => true

    // Smartcast also works with when block
    fun smartCastWhenExample(x: Any) = when (x) {
        is Boolean -> x
        is Int -> x > 0
        is String -> x.isNotEmpty()
        else -> false
    }

}

// Enum classes are similar to Java enum types.
enum class EnumExample {
    A, B, C
}
