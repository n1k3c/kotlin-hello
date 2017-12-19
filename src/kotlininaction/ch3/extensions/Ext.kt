package kotlininaction.ch3.extensions

fun String.lastChar() = get(length - 1)

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("This is View")

fun Button.showOff() = println("This is Button")

fun main(args: Array<String>) {
    println("Kotlin".lastChar())

    val view: View = Button()

    view.click()

    view.showOff()

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

    // Java API
    val string: List<String> = listOf("first", "second", "third")
    println(string.last())

    val numbers: Collection<Int> = setOf(1, 34, 33)
    println(numbers.max())
}