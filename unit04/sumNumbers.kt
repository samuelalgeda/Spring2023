import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a positive non-zero integer value: ")
    var num = scanner.nextInt()

    var sum = 0
    while (num > 0) {
        sum += num
        num--
    }

    println("The sum of all integers from 1 up to the entered value is $sum.")
}
