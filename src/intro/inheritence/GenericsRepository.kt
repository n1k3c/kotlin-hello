package intro.inheritence

class GenericsRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}

class MyRepo: Repo {
    override fun <T> getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}