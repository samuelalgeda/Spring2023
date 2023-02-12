//Name : Samuel Algeda 
//Assignment: 02.7 Cookie Calorie Calculator
//Date: 2023-02-12


fun main(args: Array<String>) {
    println("Enter number of cookies eaten:")
    val cookiesEaten = readLine()

    if (cookiesEaten != null) {
        val cookies = cookiesEaten.toInt()

        val servingSize = 40.0 / 10.0
        val caloriesPerServing = 300.0
        val caloriesPerCookie = caloriesPerServing / servingSize
        val totalCalories = cookies * caloriesPerCookie

        println("Your calorie intake was: $totalCalories calories.")
    } else {
        println("No number of cookies was entered.")
    }
}

