fun stockProfit(numShares: Int, purchasePrice: Double, purchaseCommission: Double,
                salePrice: Double, saleCommission: Double): Double {
    val totalCost = numShares * purchasePrice + purchaseCommission
    val totalRevenue = numShares * salePrice - saleCommission
    return totalRevenue - totalCost
}

fun main() {
    println("Enter the following data for your stock sale:")
    print("Number of shares: ")
    val numShares = readLine()!!.toInt()
    print("Purchase price per share: ")
    val purchasePrice = readLine()!!.toDouble()
    print("Purchase commission: ")
    val purchaseCommission = readLine()!!.toDouble()
    print("Sale price per share: ")
    val salePrice = readLine()!!.toDouble()
    print("Sale commission: ")
    val saleCommission = readLine()!!.toDouble()
    val profit = stockProfit(numShares, purchasePrice, purchaseCommission, salePrice, saleCommission)
    if (profit >= 0) {
        println("You made a profit of $$profit")
    } else {
        println("You incurred a loss of $$profit")
    }
}
