package intro.inheritence

/**
 * Created by nikola on 6/8/17.
 */

interface Repository<T> {
    fun getById(id: Int): T

    fun getAll(): List<T>
}

fun main(args: Array<String>) {

    val customerRepo = GenericsRepository<Customer>()

    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()
}