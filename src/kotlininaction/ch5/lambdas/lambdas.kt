package kotlininaction.ch5.lambdas

data class Person(val name: String, val age: Int)

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun salute() = println("Salute!")

fun Person.isAdult() = age >= 21

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })

    println(people.maxBy { p: Person -> p.age })
    println(people.maxBy { p -> p.age })
    println(people.maxBy { it.age })

    val getAge = { p: Person -> p.age }
    println(people.maxBy(getAge))

    val sum2 = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum2(1, 2))

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val responses = listOf("200 OK", "418 I'm a teapot",
    "500 Internal Server Error")
    printProblemCounts(responses)

    val age = Person::age
    // same as { person: Person -> person.age }
    println(people.maxBy(age))

    run(::salute)

    val predicate = Person::isAdult

}