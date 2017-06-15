package advanced.classes

/**
 * Created by nikola on 6/14/17.
 */

class DirectoryExplorer(val user: String) {

    inner class PermissionCheck() {

        fun validatePermission() {
            if (user != "Nikola") {

            }
        }
    }

    fun listFolder(folder: String, user: String) {

        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }

}

fun main(args: Array<String>) {

    val de = DirectoryExplorer("Nikola")

    val pc = DirectoryExplorer("Nikola").PermissionCheck()

}