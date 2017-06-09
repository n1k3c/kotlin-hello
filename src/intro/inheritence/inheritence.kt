package intro.inheritence

/**
 * Created by nikola on 6/8/17.
 */

open class Person() {
    open fun validate() {

    }
}

open class Customer: Person {
    final override fun validate() {

    }

    constructor(): super() {

    }
}

class SpecialCustomer: Customer() {

}

data class CustomerEntity(val name: String): Person()

fun main(args: Array<String>) {

    val customer = Customer()

    customer.validate()

}