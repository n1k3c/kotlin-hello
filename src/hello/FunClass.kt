package hello

/**
 * Created by nikola on 5/19/17.
 */

fun main(args: Array<String>) {
    hello1()
    hello11Type()
    hello1OneLiner()

    hello2("Nikola")
    println("${hello3()}")
    println(hello3("Nikola1"))
    println(hello3(name = "Nikola2"))
}

/*
Functions can be declared using the "fun" keyword.
Like void function in Java we have Unit function in Kotlin.
We can write simple function in one line.
Function arguments are specified in brackets after the function name.
Function arguments can optionally have a default value.
The function return type, if required, is specified after the arguments.
*/
fun hello1() {
    println("Hello1")
}

fun hello11Type() : Unit {
    println("Hello1 Unit")
}

fun hello1OneLiner() = println("Hello1Oneliner")

fun hello2(name: String) {
    println("Hello2 $name")
}

fun hello3(name: String = "World"): String {
    return "Hello $name!"
}