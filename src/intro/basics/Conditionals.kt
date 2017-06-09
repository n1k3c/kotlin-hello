package intro.basics

/**
 * Created by nikola on 6/2/17.
 */

fun main(args: Array<String>) {

    val myString = "String"

    val result = if (myString != "") {
        "Non empty"

    } else {
        "Is empty"
    }

    print(result)

    val whenValue = when (result) {
        is String -> println("Excellent")
        "Value" -> println("It's value")
        else -> {
            println("Else")
            "hello"
        }
    }

    println(whenValue)

}