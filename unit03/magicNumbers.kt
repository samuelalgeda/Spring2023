import java.util.Scanner

fun main() {
   
    val input = Scanner(System.`in`)

    print("Enter the month (in numeric form): ")
    val month = input.nextInt()
    print("Enter the day: ")
    val day = input.nextInt()
    print("Enter the two-digit year: ")
    val year = input.nextInt()

    if (month * day == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
