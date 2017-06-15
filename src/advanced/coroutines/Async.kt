package advanced.coroutines

import java.util.concurrent.CompletableFuture

/**
 * Created by nikola on 6/15/17.
 */

private fun startLongAsyncOperation(v: Int) = CompletableFuture.supplyAsync {
    Thread.sleep(1000)
    "Result: $v"
}

fun main(args: Array<String>) {

    // We need import - kotlinx.coroutines.async
   /* val future = async<String> {
        (1..5).map {
            await(startLongAsyncOperation(it))
        }
    }.joinToString("\n")*/

    println("This before")
    // println(future.get())
    println("This after")

}