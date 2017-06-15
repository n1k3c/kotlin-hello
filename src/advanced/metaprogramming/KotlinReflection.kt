package advanced.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

/**
 * Created by nikola on 6/15/17.
 */

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {

    println(Transaction::class)

    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }

    getKotlinType(Transaction::class)

    println("---------")

    val constructor = ::Transaction
    println(constructor)

    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }

    val transaction = constructor.callBy(mapOf(idParam to 1, amountParam to 2000))

    val trans = Transaction(1, 20.0, "New value")

    val nameProperty = Transaction::class.memberProperties.find { it.name == "description" }

    println(nameProperty?.get(trans))
}