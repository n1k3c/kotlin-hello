package advanced.delegation

import kotlin.properties.Delegates

/**
 * Created by nikola on 6/14/17.
 */

class Veto {
    var value: String by Delegates.vetoable("VALUE") {
        property, oldValue, newValue ->  newValue.startsWith("S")
    }
}

fun main(args: Array<String>) {

    val veto = Veto()

    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}