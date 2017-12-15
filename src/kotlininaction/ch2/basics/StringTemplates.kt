package kotlininaction.ch2.basics

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"

    println("Hello, $name!")

    println("Hello," + name + "!")

    println("\$x") // Escaping

    if (args.size > 0) println("Hello, ${args[0]}!")

    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}