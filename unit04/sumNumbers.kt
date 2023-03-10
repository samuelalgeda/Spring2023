fun main() {
    print("Enter a positive non-zero integer value: ")
    val input = readLine()

    if (input != null && input.matches("\\d+".toRegex())) {
        val num = input.toInt()
        var sum = 0

        for (i in 1..num) {
            sum += i
        }

        println("The sum of all integers from 1 up to the entered value is $sum.")
    } else {
        println("Invalid input. Please enter a positive non-zero integer value.")
    }
}
