package intro.functional

/**
 * Created by nikola on 6/9/17.
 */

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, y: Int, op: (Int) -> Unit ) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun unaryOperation(x: Int, op: (Int) -> Int) {

}

fun unaryOp(op: (Int) -> Int) {

}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    println(operation(1, 2, ::sum))

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

    println(operation(2, 3, sumLambda))

    unaryOperation(2, { x -> x * x })

    unaryOperation(3, { it * it }) // We can use 'it' when we have only one parameter

    unaryOperation(3) { it * it } // If the last parameter is function

    unaryOp {
        it * it
    }

    val db = Database()

    transaction(db) {

    }

    unaryOperation(3, fun(x: Int): Int { return x * x })


}

