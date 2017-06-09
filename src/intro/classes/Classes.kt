package intro.classes

import java.util.*

/**
 * Created by nikola on 6/6/17.
 */

class Customer(var id: Int, var name: String, val yearOfBirth: Int) {

    val age: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumbr: String = ""
    set(value) {
        if (!value.startsWith("SN")) {
            throw IllegalArgumentException("Social security should start with SN")
        }
        field = value
    }

    fun customerAsString() {
        println("id: $id - Name: $name")
    }
}

fun main(args: Array<String>) {

    val customer = Customer(0, "Haidi", 1973)

    customer.id
    customer.name
    customer.socialSecurityNumbr = "SN"

    println(customer.customerAsString())

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumbr)

}