package kotlininaction.ch4.classHierarchies

open class User(val nickname: String, val isSubscribed: Boolean = true)

class TwitterUser(nickname: String) : User(nickname)

open class CoolButton

class TwitterButton() : CoolButton()

open class View {
    constructor(ctx: String) {
        println("first const in view")
    }

    constructor(ctx: String, attr: String) {
        println("second const in view")
    }
}

class MyButton : View {
    constructor(ctx: String) : this(ctx, "") {
        println("first const in my button")
    }

//    constructor(ctx: String) : super(ctx) {
//        println("first const in my button")
//    }

    constructor(ctx: String, attr: String) : super(ctx, attr) {
        println("second conts in my button")
    }
}

class User7(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
        Address was changed for $name:
        "$field" -> "$value".""".trimIndent())
            field = value
        }
}

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val user = User("Nidjo")

    println(user.isSubscribed)

    val button = MyButton("ctx")

    val user7 = User7("Alice")
    user7.address = "Elsenheimerstraße 47, 80687 München"

    val bob = Client("Bob", 123)
    println(bob.copy(postalCode = 345))
}