package programs

fun main(args: Array<String>) {

    for (i in 1..15) {
        var output = ""

        if (i % 3 == 0) output = "Fizz"
        if (i % 5 == 0) output += "Buzz"
        if (output == "") output = i.toString()

        println(output)
    }
}