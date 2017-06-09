package hello.besides

/**
 * Created by nikola on 5/26/17.
 */

fun main(args: Array<String>) {

    var tuna = Human(24, "Mr.Bean")
    tuna.think()
}

class Human(var n: String) {

    var name: String = n

    var age: Int = 0

    init {
        println("Hello fish!")
    }

    constructor(age: Int, name: String) : this(name) {
        this.age = age
    }

    fun think() {
        println("Kotlin is awesome! $age : $name")
    }
}