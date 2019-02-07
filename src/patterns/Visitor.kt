package patterns

interface State {
    fun type()
}

class StateLoading: State {

    val title = "State loading"

    companion object {
        var type: (StateLoading) -> Unit = {}
    }

    override fun type() {
        StateLoading.type(this)
    }
}

fun stateLoading() {
    StateLoading.type = {
        println(it.title)
    }
}

fun main(args: Array<String>) {
    val states = listOf<State>(StateLoading(), StateLoading())
    stateLoading()
    states.forEach {
        it.type()
    }
}