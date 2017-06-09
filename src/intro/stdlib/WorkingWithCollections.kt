package intro.stdlib

import java.util.*

/**
 * Created by nikola on 6/9/17.
 */

fun main(args: Array<String>) {

    var emptyList = emptyList<String>()
    var list = listOf("1", "2")

    val numbers = 1..100

    val cities = listOf("Madrid", "Paris", "London")

    val empty = emptyList<String>()
    println(cities.javaClass)
    println(empty.javaClass)

    val arrayList = Arrays.asList("Madrid", "London")
    println(arrayList.javaClass)

    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))

    val booleans = booleanArrayOf(true, false, true)

    val chars = charArrayOf('A', 'B')

}