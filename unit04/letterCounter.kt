print("Enter a character: ")
val ch = readLine()?.get(0)

if (str != null && ch != null) {
    val count = str.count { it == ch }
    println("The character '$ch' appears $count times in the string.")
} else {
    println("Invalid input")
}
