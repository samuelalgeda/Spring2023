// Name: Samuel Algeda
// Assignment: 02.5 Star Pattern
// Date: 2023-02-12

fun main(args: Array<String>) {
    for (i in 1..7) {
        for (j in 1..7 - i) {
            print(".")
        }
        for (j in 1..2 * i - 1) {
            print("*")
        }
        println()
    }

    for (i in 6 downTo 1) {
        for (j in 1..7 - i) {
            print(".")
        }
        for (j in 1..2 * i - 1) {
            print("*")
        }
        println()
    }
}
