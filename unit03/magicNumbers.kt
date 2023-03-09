fun main() {
    print("Enter the month (in numeric form): ")
    val month = readLine()?.toInt() ?: 0
    print("Enter the day: ")
    val day = readLine()?.toInt() ?: 0
    print("Enter the two-digit year: ")
    val year = readLine()?.toInt() ?: 0

    if (month * day == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
