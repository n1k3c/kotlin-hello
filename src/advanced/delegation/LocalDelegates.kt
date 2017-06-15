package advanced.delegation

/**
 * Created by nikola on 6/14/17.
 */

fun localDelegatedPropreties() {

    val lazy by lazy { initLate() }

}

fun  initLate(): String {
    return "String"
}
