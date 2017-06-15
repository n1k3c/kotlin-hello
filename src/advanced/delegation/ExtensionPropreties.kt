package advanced.delegation

/**
 * Created by nikola on 6/14/17.
 */

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {

    println("Hello".hasAmpersand)
    println("Hello & Bye".hasAmpersand)

}