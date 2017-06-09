package intro.functional

/**
 * Created by nikola on 6/9/17.
 */

fun outsideFunction() {

    for (number in 1..30) {


        unaryOperation(20, { x ->
            println(number)
            x * number
        })

    }

}

fun main(args: Array<String>) {

    outsideFunction()

}