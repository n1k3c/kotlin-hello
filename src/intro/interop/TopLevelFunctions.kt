@file:JvmName("UtilityClass")
package intro.interop

/**
 * Created by nikola on 6/9/17.
 */

const val CopyrightYear = 2016

fun prefix(prefix: String, value: String): String {
    return "$prefix - $value"
}