package intro.functional

/**
 * Created by nikola on 6/9/17.
 */

fun String.hello() {
    println("Hello")
}

fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}

fun main(args: Array<String>) {

    val string = "Another one"

    string.hello()
    "dfd".hello()

    println("This is sample string".toTitleCase("Again  - "))

    val customer = Customer()
    customer.makePreferred("New version")

    // val instance = InheritedClass()
    val instance: BaseClass = InheritedClass()
    instance.extension()

}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred(message: String) {
    println(message)
}

open class BaseClass
class InheritedClass : BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}