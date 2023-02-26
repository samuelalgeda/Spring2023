fun main() {
    val baseFee = 10.0 // base fee of $10 per month
    var checkFee = 0.0 // check fee to be calculated based on the number of checks
    var numChecks: Int

    print("Enter the number of checks written for the month: ")
    numChecks = readLine()?.toInt() ?: 0

    // Calculate check fee based on the number of checks
    checkFee = when {
        numChecks < 20 -> numChecks * 0.10
        numChecks < 40 -> numChecks * 0.08
        numChecks < 60 -> numChecks * 0.06
        else -> numChecks * 0.04
    }

    // Calculate total fee
    val totalFee = baseFee + checkFee

    // Display the bank's service fees for the month
    println("The bank's service fees for the month are: $$totalFee")
}
