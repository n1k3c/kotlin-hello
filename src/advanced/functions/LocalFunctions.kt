package advanced.functions

/**
 * Created by nikola on 6/11/17.
 */

fun foo(fooParam: String) {

    val outerFunction = "Value"

    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(barParam)
    }

}

fun main(args: Array<String>) {

    foo("Some")

}