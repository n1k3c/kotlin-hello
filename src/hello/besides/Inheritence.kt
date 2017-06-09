package hello.besides

/**
 * Created by nikola on 5/26/17.
 */

fun main(args: Array<String>) {
    var foo = Tuna("Parameter").sayHello()
}

open class FishFish(parameter: String) {
    init {
        println("Hello from Fish init $parameter")
    }

    open fun sayHello() = println("Hello from Fish fun")
}

class Tuna(parameter: String) : FishFish(parameter) {
    init {
        println("Hello from Tuna init")
    }

    override fun sayHello() = println("Hello from Tuna fun")
}
