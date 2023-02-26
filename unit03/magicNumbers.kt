import java.util.Scanner

fun main() {
    // Create a Scanner object for user input
    val input = Scanner(System.`in`)

    // Prompt the user to enter a date
    print("Enter the month (in numeric form): ")
    val month = input.nextInt()
    print("Enter the day: ")
    val day = input.nextInt()
    print("Enter the two-digit year: ")
    val year = input.nextInt()

    // Check if the date is magic
    if (month * day == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
