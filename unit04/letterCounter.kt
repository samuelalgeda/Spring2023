import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a string: ")
    val str = scanner.nextLine()

    print("Enter a character: ")
    val ch = scanner.next()[0]  

    val count = str.count { it == ch }
    println("The character '$ch' appears $count times in the string.")
}
