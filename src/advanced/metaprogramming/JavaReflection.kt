package advanced.metaprogramming

import java.lang.reflect.Type

/**
 * Created by nikola on 6/14/17.
 */

class Transaction(val id: Int, val amount: Double, var description: String = "Some value") {
    fun validate() {
        if (amount > 10000) {
            println("package advanced.metaprogramming.Transaction is to large!")
        }
    }
}

fun introspectInstance(obj: Any) {

    println("Class ${obj.javaClass.simpleName}")
    println("Propreties:\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions:\n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name}")
    }

}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {

    getType(Transaction::class.java)

    introspectInstance(Transaction(1, 200.0, "Simple transaction!"))

}
