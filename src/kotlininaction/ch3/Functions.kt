package kotlininaction.ch3

const val UNIX_LINE_SEPARATOR = "\n"

val list = listOf(1, 2, 3)

fun <T> joinToString(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    println(list)

    println(joinToString(list, "; ", "(", ")"))
    println(joinToString(list, prefix = "$"))
}