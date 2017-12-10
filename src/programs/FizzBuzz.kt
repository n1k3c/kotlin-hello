package programs

fun main(args: Array<String>) {

    for (i in 1..100) {
        var output = ""

        if (i % 3 == 0) output = "Fizz" // Fizz ili ""
        if (i % 5 == 0) output += "Buzz" // FizzBuzz
        if (output == "") output = i.toString()

        println(output)
    }
}