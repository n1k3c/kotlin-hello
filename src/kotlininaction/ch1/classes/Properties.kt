package kotlininaction.ch1.classes

class Person(
        val name: String,
        var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)

    println(person.name)

    person.isMarried = false

    println(person.isMarried)
}

