
package advanced.functions

/**
 * Created by nikola on 6/13/17.
 */

class Request(val method: String, val query: String, val contentType: String)

class Response(var contents: String, var status: Status) {

    operator fun invoke(status: Status.() -> Unit) {

    }
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}

fun routeHandler(path: String, f: RouteHandler.() -> Unit) : RouteHandler.() -> Unit = f

fun main(args: Array<String>) {

    routeHandler("/index.html") {
        if (request.query != "") {
            // process
        }

        response {
                code = 404
                description = "Not found"
        }

        //response.status.code
    }

    val manager = Manager()
    manager("Do something!")
}

class Manager {
    operator fun  invoke(value: String) {

    }
}
