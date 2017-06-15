package advanced.generics

import advanced.classes.Customer

/**
 * Created by nikola on 6/14/17.
 */

open class Person()
class Employee: Person()

fun operate(person: List<Person>) {}

interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main(args: Array<String>) {

    operate(listOf<Employee>())
    operate(listOf<Person>())

    val ro = ReadOnlyRepoImpl<Customer>()

    ro.getAll()

}

class ReadOnlyRepoImpl<out T> : ReadOnlyRepo<T> {

    override fun getId(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}