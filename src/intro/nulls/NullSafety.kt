package intro.nulls

import intro.classes.CustomerJava

/**
 * Created by nikola on 6/8/17.
 */

class Service {
    fun evaluate(){}
}

class ServiceProvider {
    fun createServices(): Service? {
        return Service()
    }
}

fun main(args: Array<String>) {


    val message: String = "Message"

    var nullMessage: String? = null
    val inferredNull = null

    nullMessage = "Some value"

    println(nullMessage.length)

    // println(nullMessage!!.length) <- fuck that, let's be null


    println(message.length)

    val customerJava = CustomerJava()

    if (customerJava != null) {
        if (customerJava.name != null) {
            println(customerJava.name.length)
        }
    }

    val sp = createsServiceProvider()

    sp?.createServices()?.evaluate()


}

private fun createsServiceProvider(): ServiceProvider? = ServiceProvider()