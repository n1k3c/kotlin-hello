package kotlininaction.ch5.lambdas

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })

    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.filter { it.age > 30 })

    println(list.map { it * it })

    println(people.filter { it.age > 30 }.map(Person::name))

    people.filter { it.age == people.maxBy(Person::age)?.age }
    // better solution
    val maxAge = people.maxBy(Person::age)?.age
    people.filter { it.age == maxAge }

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))

    val people2 = listOf(Person("Alice", 31),
            Person("Bob", 29), Person("Carol", 31))
    println(people2.groupBy { it.age })

    val list2 = listOf("a", "ab", "b")
    println(list2.groupBy(String::first))

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neal Gaiman")))
    println(books.flatMap { it.authors }.toSet())

    people.asSequence()
            .map(Person::name)
            .filter { it.startsWith("A") }
            .toList()

    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}