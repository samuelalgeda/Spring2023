fun main() {
    println("Is anyone in your party a vegetarian? ")
    val isVegetarian = readLine()?.equals("yes", ignoreCase = true) ?: false

    println("Is anyone in your party a vegan? ")
    val isVegan = readLine()?.equals("yes", ignoreCase = true) ?: false

    println("Is anyone in your party gluten-free? ")
    val isGlutenFree = readLine()?.equals("yes", ignoreCase = true) ?: false

    println("Here are your restaurant choices:")

    if (!isVegetarian && !isVegan && !isGlutenFree) {
        println("Joe's Gourmet Burgers")
    }

    if (isVegetarian && !isVegan && isGlutenFree) {
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }

    if (isVegetarian && isVegan && isGlutenFree) {
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }

    if (isVegetarian && !isVegan && !isGlutenFree) {
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("Mama's Fine Italian")
        println("The Chef's Kitchen")
    }

    if (isVegetarian && isVegan && !isGlutenFree) {
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
}
