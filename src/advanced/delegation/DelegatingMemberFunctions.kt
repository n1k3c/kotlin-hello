package advanced.delegation

/**
 * Created by nikola on 6/14/17.
 */

interface Repository {
    fun getById()
    fun getAll()
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger {

    fun index() {
        getAll()
        getById()
    }
}