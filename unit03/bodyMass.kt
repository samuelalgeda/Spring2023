import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    
    print("Enter your weight in pounds: ")
    val weight = input.nextDouble()
    print("Enter your height in inches: ")
    val height = input.nextDouble()

    val bmi = weight * 703 / (height * height)

    val status = when {
        bmi < 18.5 -> "underweight"
        bmi <= 25 -> "optimal weight"
        else -> "overweight"
    }

    println("Your BMI is ${"%.1f".format(bmi)}, which is considered $status.")
}
