package intro.stdlib

import java.io.File

/**
 * Created by nikola on 6/11/17.
 */

fun main(args: Array<String>) {

    val file = File("filename.txt")

    if (file.isAbsolute) {
        file.name


    }

    with(file) {

    }

    val string: String? ="Some value"

    string?.let {
        it.length
    }



}