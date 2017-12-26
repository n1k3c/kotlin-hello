package kotlininaction.ch4.classHierarchies

object CustomersData {

    var count = 1

    fun typeOfCustomer(): String {
        return "Best"
    }
}

fun main(args: Array<String>) {
    CustomersData.count = 2
    println(CustomersData.count)
}