package kotlininaction.ch5.lambdas

//fun alphabet(): String {
//    val result = StringBuilder()
//    for (letter in 'A'..'Z') {
//        result.append(letter)
//    }
//    result.append("\nNow I know the alphabet!")
//    return result.toString()
//}

//fun alphabet(): String {
//    val stringBuilder = StringBuilder()
//    return with(stringBuilder) {
//        for (letter in 'A'..'Z') {
//            this.append(letter)
//        }
//        append("\nNow I know the alphabet!")
//        this.toString()
//    }
//}


fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

//fun alphabet2() = StringBuilder().apply {
//    for (letter in 'A'..'Z') {
//        append(letter)
//    }
//    append("\nNow I know the alphabet!!")
//}.toString()

fun alphabet2() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!!")
}

fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet2())
}