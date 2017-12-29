package kotlininaction.ch6.nullable

fun strLen(s: String?) = if (s != null) s.length else 0

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName() = company?.address?.country ?: "Unknown"

fun printShippingLabel(person: Person) {
    val address = person.company?.address
            ?: throw IllegalArgumentException("No address")

    with(address) {
        println(streetAddress)
        println("$zipCode, $city, $country")
    }
//    println(address.streetAddress)
//    println("${address.zipCode}, ${address.city}, ${address.country}")
}

fun sendEmailTo(email: String) { /*...*/ }

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank())
        println("Please fill in the required fields")
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
    println(strLen(null))

    val person2 = Person("Nikola", null)
    println(person2.countryName())

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)

    printShippingLabel(person)

    val email: String? = "email"

    if (email != null) {
        sendEmailTo(email)
    }

    email?.let {
        email -> sendEmailTo(email)
    }

    email?.let { sendEmailTo(it) }

    verifyUserInput(" ")
    verifyUserInput(null)

    fail("Error occurred")
}