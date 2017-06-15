package advanced.classes

import kotlin.properties.Delegates

/**
 * Created by nikola on 6/14/17.
 */

typealias Name = String
typealias EmailData = String

class Employee(val name: Name, val email: EmailData) {

    var department: String by Delegates.observable("VALUE", { property, oldValue, newValue ->
        println("Property: ${property.name} has changed from $oldValue to $newValue")
    })

    fun printName(name: String) {
        println("$name")
    }
}

fun main(args: Array<String>) {

    val employee = Employee("Hadi", "mail@mail.com")

    employee.printName("Hadi")

    employee.department = "IT"
}