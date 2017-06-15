package advanced.classes

/**
 * Created by nikola on 6/14/17.
 */

class Customer() {
    var lastPurchasedAmount: Double = 0.0
        get() = field
        set(value) {
            if (value > 100) {
                field = value
            }
        }
}

fun main(args: Array<String>) {

    val customer = Customer()

    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount = 200.0

    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount = 50.0
    println(customer.lastPurchasedAmount)

}