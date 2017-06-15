package advanced.classes

/**
 * Created by nikola on 6/14/17.
 */

class Log private constructor() {

    companion object Factory {
        // Add @JvmStatic to acces from Java
        fun createFileLog(filename: String): Log = Log(filename)
    }

    constructor(filename: String): this()

}

fun main(args: Array<String>) {

    val log = Log.createFileLog("filename.txt")

    // val log2 = Log() - hidding constructor does not allow it
}