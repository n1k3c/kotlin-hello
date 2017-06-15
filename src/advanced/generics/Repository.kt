package advanced.generics

import java.io.Serializable


/**
 * Created by nikola on 6/14/17.
 */
// Up a bound restriction
open class Entity(val id: Int)

// Any? is default (null also)
class Repository<T: Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {

        }
    }
}

fun <T: Serializable> streamObject(obj: T) {

}

fun main(args: Array<String>) {

    // 'CustomerEntity' must EXTEND 'Entity' !!!
    val repo = Repository<CustomerEntity>()

}

class CustomerEntity: Entity(0) {

}
