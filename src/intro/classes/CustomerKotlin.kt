package intro.classes

import intro.functions.throwingExceptions
import java.io.IOException

/**
 * Created by nikola on 6/6/17.
 */

data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    @JvmField val someProperty = "Value"

    override fun toString(): String {
        return super.toString()
        // You can override this fella
    }

    @JvmOverloads fun changeStatus(status: Status = Status.Current) {

    }

    @JvmName("preferential") fun makePreferred() {

    }

    @Throws(IOException::class) fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename cannot be blank")
        }
    }

}

fun CustomerKotlin.extenstion() {

}

enum class Status {
    Current,
    Past
}

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(123, "Nikola", "mail")
    val customer2 = CustomerKotlin(123, "Nikola", "mail")

    println(customer1)

    val customer3 = customer1

    if (customer1 == customer2) {
        println("There are the same")
    }

    println(customer3.id)

    val customer4 = customer1.copy(id = 12345)
    println(customer4.id)
}