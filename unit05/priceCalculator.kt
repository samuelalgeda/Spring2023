fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * (markupPercentage / 100)
    val retailPrice = wholesaleCost + markupAmount
    return retailPrice
}

fun main() {
    print("Enter the item's wholesale cost: ")
    val wholesaleCost = readLine()!!.toDouble()
    print("Enter the markup percentage: ")
    val markupPercentage = readLine()!!.toDouble()
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is %.2f".format(retailPrice))
}
