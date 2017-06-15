package intro.stdlib

import java.io.File

/**
 * Created by nikola on 6/11/17.
 */

fun main(args: Array<String>) {

    val file = File("text.txt")

    if (file.isAbsolute) {
        // ...
        file.isAbsolute
        file.isHidden
    }

    // alternative...
    with (file) {
        // ...
        isAbsolute and isHidden
        isHidden
    }

}