fun fallingDistance(time: Double): Double {
    val g = 9.8
    return 0.5 * g * time * time
}

fun main() {
    for (i in 1..10) {
        val distance = fallingDistance(i.toDouble())
        println("Time: $i seconds, Distance: $distance meters")
    }
}
