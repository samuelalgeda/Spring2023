//Name : Samuel Algeda 
//Assignment: 02.8 String Manipulator
//Date: 2023-02-12

fun main(args: Array<String>) {
    print("Enter the name of your favorite city: ")
    val city = readLine()

    if (city != null) {
        //Calculating the number of characters
        val numCharacters = city.length

        //Converting the city name to all uppercase letters
        val cityUpper = city.toUpperCase()

        //Converting the city name to all lowercase letters
        val cityLower = city.toLowerCase()

        //Getting the first character of the city name
        val firstChar = city[0]

        //Displaying the results
        println("The number of characters in the city name: $numCharacters")
        println("The name of the city in all uppercase letters: $cityUpper")
        println("The name of the city in all lowercase letters: $cityLower")
        println("The first character in the name of the city: $firstChar")
    } else {
        println("No city name was entered.")
    }
}
