import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Enter the mass of the object in kilograms: ")
    val mass = input.nextDouble()

    val weight = mass * 9.8

    when {
        weight > 1000 -> println("The object is too heavy.")
        weight < 10 -> println("The object is too light.")
        else -> println("The weight of the object is %.2f Newtons.".format(weight))
    }
}
