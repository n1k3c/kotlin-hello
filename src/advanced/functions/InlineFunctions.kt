package advanced.functions

/**
 * Created by nikola on 6/11/17.
 */

// inline only with lambas (look at bycode)
// -> copy paste code

fun noOp(x: Int) {

}

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After callin op()")
}

// We cannot do that
fun tryingToInline(op: () -> Unit) {
    val reference = op
    println("Assigned value")
    op()
}

fun anotherFunction() {
    operation { println("This is the actual op function") }
}

fun main(args: Array<String>) {

    operation { println("This is the actual op function") }

}