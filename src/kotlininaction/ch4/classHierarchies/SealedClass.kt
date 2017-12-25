package kotlininaction.ch4.classHierarchies

//interface Expr
//class Num(val value: Int) : Expr
//class Sum(val left: Expr, val right: Expr) : Expr
//
//fun eval(e: Expr): Int =
//        when (e) {
//            is Num -> e.value
//            is Sum -> eval(e.right) + eval(e.left)
//            else -> throw IllegalArgumentException("Unknown expression")
//        }


sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}


fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.right) + eval(e.left)
        }

