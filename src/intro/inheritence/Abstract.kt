package intro.inheritence

/**
 * Created by nikola on 6/8/17.
 */

abstract class StoretEntity {
    val isActive = true
    abstract  fun store()

    fun status(): String {
        return isActive.toString()
    }
}

class Employee: StoretEntity() {
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {

    val se = Employee()
    se.store()
    se.isActive
    se.status()

}