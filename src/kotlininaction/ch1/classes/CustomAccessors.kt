package kotlininaction.ch1.classes

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(43, 40)

    println(rectangle.isSquare)
}

