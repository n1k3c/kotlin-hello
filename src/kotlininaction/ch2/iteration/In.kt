package kotlininaction.ch2.iteration

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "Is digit."
    in 'a'..'z', in 'A'..'Z' -> "Is letter."
    else -> "Dunno!"
}

fun main(args: Array<String>) {
    println(isLetter('c'))
    println(isNotDigit('5'))
    println(recognize('0'))

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}
