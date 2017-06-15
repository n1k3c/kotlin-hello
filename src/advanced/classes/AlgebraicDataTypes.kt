package advanced.classes

/**
 * Created by nikola on 6/14/17.
 */

sealed class PageResult {

}

class Succes(val content: String): PageResult()

class Error(val code: Int, val message: String): PageResult()

fun getURLPage(url: String): PageResult {

    val wasValidCall = false

    if (wasValidCall) {
        return Succes("The content")
    } else {
        return Error(404, "Not found")
    }
}

fun main(args: Array<String>) {

    val pageResult = getURLPage("/")
    when (pageResult) {
        is Succes -> println(pageResult.content)
        is Error -> println(pageResult.message)
    }

}