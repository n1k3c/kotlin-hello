// Link for this tutorial: https://learnxinyminutes.com/docs/kotlin/
//
// Single-line comments start with //
/*
Multi-line comments look like this.
*/

// The "package" keyword works in the same way as in Java.
package hello

/**
 * Created by nikola on 5/17/17.
 */

/*
The entry point to a Kotlin program is a function named "main".
The function is passed an array containing any command line arguments.
*/
fun main(args: Array<String>) {
    println("Hello World!")

    /*
    Declaring values is done using either "var" or "val".
    "val" declarations cannot be reassigned, whereas "vars" can.
    */
    val fooVal = 7 // we cannot later reassign fooVal to something else
    var fooVar = 10
    fooVar = 20 // fooVar can be reassigned

    /*
    In most cases, Kotlin can determine what the type of a variable is,
    so we don't have to explicitly specify it every time.
    We can explicitly declare the type of a variable like so:
    */
    val foo: Int = 11

    /*
    Strings can be represented in a similar way as in Java.
    Escaping is done with a backslash.
    */
    val fooString = "Najbolji string"
    val barString = "Ajmo u novi \nredic"
    val bazString = "Tabic mali \twihuu"

    // Let's print
    println(fooString)
    println(barString)
    println(bazString)

    /*
   A raw string is delimited by a triple quote (""").
   Raw strings can contain newlines and any other characters.
   */
    val fooRawString = """
fun helloWorld(val name : String) {
   println("Hello, world!")
}
"""

    println(fooRawString)

    /*
    Strings can contain template expressions.
    A template expression starts with a dollar sign ($).
    */
    val fooTemplateString = "$fooString ima ${fooString.length} znakova."
    println(fooTemplateString)

    /*
   For a variable to hold null it must be explicitly specified as nullable.
   A variable can be specified as nullable by appending a ? to its type.
   We can access a nullable variable by using the ?. operator.
   We can use the ?: operator to specify an alternative value to use
   if a variable is null.
   */
    var fooNullable: String? = "ejbici"
    println(fooNullable?.length)
    println(fooNullable?.length ?: -1)
    fooNullable = null
    println(fooNullable?.length)
    println(fooNullable ?: -1)
    println(fooNullable)

}