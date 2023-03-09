fun main() {
    print("Enter a number within the range of 1 through 10: ")
    val number = readLine()!!.toInt()

    if (number < 1 || number > 10) {
        println("Error: Number must be within the range of 1 through 10.")
    } else {
        val romanNumeral = if (number == 1) "I"
                            else if (number == 2) "II"
                            else if (number == 3) "III"
                            else if (number == 4) "IV"
                            else if (number == 5) "V"
                            else if (number == 6) "VI"
                            else if (number == 7) "VII"
                            else if (number == 8) "VIII"
                            else if (number == 9) "IX"
                            else "X"
        println("The Roman numeral version of $number is $romanNumeral.")
    }
}

