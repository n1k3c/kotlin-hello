package intro.classes

/**
 * Created by nikola on 6/7/17.
 */

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            throw UnsupportedOperationException("throwing!!!")
        }

        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {

    val priority = Priority.NORMAL

    println(priority)
    println(priority.value)
    println(Priority.MAJOR.ordinal)

    for (priori in Priority.values()) {
        println(priori)
    }

    println(Priority.valueOf("MAJOR"))

    println(Priority.MINOR.text())

}