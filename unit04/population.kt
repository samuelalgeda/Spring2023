fun main() {
    var population = 0
    while (population < 2) {
        print("Enter the starting size of the population (must be at least 2): ")
        population = readLine()?.toIntOrNull() ?: 0
    }
    var increase = 0.0
    while (increase <= 0) {
        print("Enter the average daily population increase (as a percentage): ")
        increase = readLine()?.toDoubleOrNull() ?: 0.0
    }
    var days = 0
    while (days < 1) {
        print("Enter the number of days they will multiply (must be at least 1): ")
        days = readLine()?.toIntOrNull() ?: 0
    }
    var currentPopulation = population.toDouble()
    println("Starting population: $population")
    for (day in 1..days) {
        val dailyIncrease = currentPopulation * (increase / 100)
        currentPopulation += dailyIncrease
        println("Day $day: ${currentPopulation.toInt()}")
    }
}
