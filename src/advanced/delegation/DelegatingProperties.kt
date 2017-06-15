package advanced.delegation

import kotlin.reflect.KProperty

/**
 * Created by nikola on 6/14/17.
 */

class Service {

    var someProperty: String by ExternalFunctionality()
}

class ExternalFunctionality {

    var backingField = "Default"
    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue called with params: \n" +
            "service: $service\n" +
            "property: ${property.name}")
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
        backingField = value
    }
}

fun main(args: Array<String>) {

    val service = Service()

    println(service.someProperty)
    service.someProperty = "New Value"
    println(service.someProperty)
}


