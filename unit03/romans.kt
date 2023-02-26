import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Enter a number within the range of 1 through 10: ")
    val number = scanner.nextInt()

    if (number < 1 || number > 10) {
        println("Error: Number must be within the range of 1 through 10.")
    } else {
        val romanNumerals = arrayOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
        println("The Roman numeral version of $number is ${romanNumerals[number - 1]}.")
    }
}
