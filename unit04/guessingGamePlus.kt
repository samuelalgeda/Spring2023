fun main() {
    val randomNumber = (1..100).random()

    var numGuesses = 0

    var guess: Int?
    do {
        print("Guess the number between 1 and 100: ")
        guess = readLine()?.toIntOrNull()

        numGuesses++

        if (guess != null) {
            if (guess > randomNumber) {
                println("Too high, try again.")
            } else if (guess < randomNumber) {
                println("Too low, try again.")
            }
        }
    } while (guess != randomNumber)
    
    println("Congratulations, you guessed the number $randomNumber in $numGuesses guesses!")
}
