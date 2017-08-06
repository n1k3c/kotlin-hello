package programs

/*
    1 1 2 3 5 8 13 21 34 55...N
 */

fun main(args: Array<String>) {

    var k = 0
    var a = 1
    var b = 1

    print("1, 1, ")

    while (k <= 50) {
        k = a + b
        print("$k, ")
        a = b
        b = k
    }

    println("sum is " + fibonnaci(10))

}

fun fibonnaci(num: Int): Int {
    if (num == 0 || num == 1) return num
    else return fibonnaci(num - 1) + fibonnaci(num - 2)
}
