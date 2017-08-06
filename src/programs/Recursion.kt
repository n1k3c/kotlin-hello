package programs

import java.math.BigInteger

fun main(args: Array<String>) {

    val num = BigInteger("50000")

    println(fact(num, BigInteger.ONE))
}

tailrec fun fact(num: BigInteger, result: BigInteger) : BigInteger {
    if (num == BigInteger.ZERO) return result
    else return fact(num - BigInteger.ONE, num * result)
}