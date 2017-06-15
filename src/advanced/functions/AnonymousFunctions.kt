package advanced.functions

/**
 * Created by nikola on 6/11/17.
 */

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {

    op(3, { it * it })

    op(3, { x -> x * x})

    op(3, fun(x): Int {
        if (x > 10) {
            return 0
        } else {
            return x * x
        }
    })

}