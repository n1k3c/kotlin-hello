package hello

/**
 * Created by nikola on 5/19/17.
 */

fun main(args: Array<String>) {
    hello1()
    hello11Type()
    hello1OneLiner()

    println("\n")

    hello2("Nikola")
    println("${hello3()}")
    println(hello3("Nikola1"))
    println(hello3(name = "Nikola2"))
    hello4("Nikola", 7)

    println("\n")

    varargExample() // => Argument has 0 elements
    varargExample(1) // => Argument has 1 elements
    varargExample(1, 3, 3) // => Argument has 3 elements
    names("Nikola", "Marko", "Teletabis", age = 24)
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

fun hello11Type(): Unit {
    println("Hello1 Unit")
}

fun hello1OneLiner() = println("Hello1Oneliner")

fun hello2(name: String) {
    println("Hello2 $name")
}

fun hello3(name: String = "World"): String {
    return "Hello $name!"
}

fun hello4(name: String, number: Int) {
    println("Name is $name, number is $number")
}

/*
A function parameter may be marked with the "vararg" keyword
to allow a variable number of arguments to be passed to the function.
*/
fun varargExample(vararg number: Int) {
    println("Argument has ${number.size} arguments.")

    for (name in number) {
        println(name)
    }
}

fun names(vararg names: String, age: Int) {
    for (n in names) {
        println("$n is $age old")
    }
}

