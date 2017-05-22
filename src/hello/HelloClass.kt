package hello

/**
 * Created by nikola on 5/19/17.
 */

fun main(args: Array<String>) {

    /*
   To create a new instance we call the constructor.
   Note that Kotlin does not have a "new" keyword.
   */
    val fooExampleClass = ExampleClass(9)
    println(fooExampleClass.memberFunction(4))

    /*
    If a function has been marked with the "infix" keyword then it can be
    called using infix notation.
    */
    println(fooExampleClass infixMemberFunction 10)

    // Data class
    val fooData = DataClassExample(1, 2, 3)
    println(fooData)

    // Data classes have a "copy" function.
    val fooCopy = fooData.copy(y = 10)
    println(fooCopy)

    // Objects can be destructured into multiple variables.
    val(a, b, c) = fooCopy
    println("$a, $b, $c")

    // Destructuring in "for" loop
    for ((a, b, c) in listOf(fooData)) {
        println("$a, $b, $c")
    }

    // Map.Entry is destructurable as well
    val mapData = mapOf("a" to 1, "b" to 2)

    for ((key, value) in mapData) {
        println("$key -> $value")
    }

    // The "with" function is similar to the JavaScript "with" statement.
    val fooMutableData = MutableDataClassExample(10, 20 , 30)

    with (fooMutableData) {
        x -= 1
        y += 2
        z--
    }
    println(fooMutableData)

}

// The "class" keyword is used to declare classes.
class ExampleClass(val x: Int) {
    fun memberFunction(y: Int): Int {
        return x + y
    }

    infix fun infixMemberFunction(y: Int): Int {
        return x * y
    }
}

/*
   Data classes are a concise way to create classes that just hold data.
   The "hashCode"/"equals" and "toString" methods are automatically generated.
   */
data class DataClassExample(val x: Int, val y: Int, val z: Int)

data class MutableDataClassExample(var x: Int, var y: Int, var z: Int)