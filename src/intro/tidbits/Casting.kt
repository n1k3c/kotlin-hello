package intro.tidbits

/**
 * Created by nikola on 6/8/17.
 */

open class Person {

}

class Employee : Person() {
        fun vacationDays(days: Int) {
            if (days < 60) {
                println("You need more vacation")
            }
        }
}

class Contractor : Person() {

}

fun hasVacation(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(20)
    } else {

    }
}

var input: Any = 10

fun main(args: Array<String>) {

    val str = input as? String

    println(str?.length)

}

