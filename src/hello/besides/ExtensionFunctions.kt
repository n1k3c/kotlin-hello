package hello.besides

/**
 * Created by nikola on 5/25/17.
 */

fun main(args: Array<String>) {

    var smallSteak = Fish()
    smallSteak.tuna = "small"
    smallSteak.show()

    var bigSteak = Fish()
    bigSteak.tuna = "big"
    bigSteak.show()

    var steak = smallSteak plus bigSteak //or = smallSteak.plus(bigSteak)
    steak.show()
}

open class Fish {

    var tuna: String? = null

    fun show() {
        println(tuna)
    }
}

infix fun Fish.plus(fish: Fish) : Fish {

    var sizes = Fish()
    sizes.tuna = this.tuna + " - " + fish.tuna
    return sizes
}