//Name: Samuel
//Assignment: 02.7 Cookie Calorie Calculator
//Date: 2023-02-12

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val cookiesPerBag = 40
    val caloriesPerServing = 300
    val servingsPerBag = 10
    val caloriesPerCookie = caloriesPerServing / servingsPerBag
    println("Enter number of cookies eaten:")
    val cookiesEaten = scanner.nextInt()
    val totalCalories = cookiesEaten * caloriesPerCookie
    println("Your calorie intake was: $totalCalories calories.")
}
