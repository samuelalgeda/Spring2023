// Name :Samuel Algeda
// Assignment:02.9 Compound Interest
// Date/ 2/12/2023

fun compoundInterest(principal: Double, rate: Double, compoundingFrequency: Double, time: Double): Double {
    val compoundRate = rate / compoundingFrequency
    return principal * Math.pow(1 + compoundRate, compoundingFrequency * time)
}

fun main() {
    print("Enter the amount of money originally deposited into the account: ")
    val principal = readLine()?.toDouble() ?: 0.0

    print("Enter the annual interest rate: ")
    val rate = readLine()?.toDouble() ?: 0.0

    print("Enter the number of times per year the interest is compounded: ")
    val compoundingFrequency = readLine()?.toDouble() ?: 0.0

    print("Enter the number of years the account will be left to earn interest: ")
    val time = readLine()?.toDouble() ?: 0.0

    val result = compoundInterest(principal, rate, compoundingFrequency, time)
    println("The amount of money in the account after $time years is: $result")
}
