package advanced.functions

/**
 * Created by nikola on 6/11/17.
 */

data class Time(val hours: Int, val mins: Int) {

    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

fun main(args: Array<String>) {

    val newTime = Time(10, 34) + Time(3, 20) + Time(1, 6)
    val newTime2 = Time(10, 34).plus(Time(3, 20)).plus(Time(1, 6))

    println(newTime)
    println(newTime2)
}