package intro.tidbits

import intro.classes.CustomerKotlin
import intro.inheritence.Customer

/**
 * Created by nikola on 6/8/17.
 */

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 230000000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {

    val result = capitalAndPopulation("Spain")

    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("Spain")

    countryInfo.third

    val (capital, continent, population) = countryInformation("Spain")

    println(capital)
    println(continent)
    println(population)

    val (id, name, email) = CustomerKotlin(1, "Hadi", "email@email.com")

    println(email)

    val listCapitalAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((city, country) in listCapitalAndCountries) {
        println("$city - $country")
    }

}