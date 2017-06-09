
package intro.interop

import intro.classes.CustomerJava

/**
 * Created by nikola on 6/9/17.
 */

fun main(args: Array<String>) {

    val customer = CustomerJava()

    customer.email = "mail@mail.com"

    customer.prettyPrint()

    val runnable = Runnable { println("Invoking runnable") }

    val kr = KotlinCustomerRepo()

    val customerJava = kr.getById(10)


    customer.neverNull()
}

class PersonKotlin : PersonJava() {

}

class KotlinCustomerRepo : CustomerRepository {
    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class RunnableKotlin : Runnable {
    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}