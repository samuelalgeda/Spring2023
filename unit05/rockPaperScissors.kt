import kotlin.random.Random

fun main() {
    println("Welcome to Rock, Paper, Scissors!")
    println("Please choose one of the following options:")
    println("1 - Rock")
    println("2 - Paper")
    println("3 - Scissors")

    val computerChoice = Random.nextInt(1, 4)
    val userChoice = getUserChoice()

    println("Computer chooses ${getChoiceString(computerChoice)}")
    println("You choose ${getChoiceString(userChoice)}")

    val result = determineWinner(computerChoice, userChoice)

    when {
        result == 0 -> println("It's a tie!")
        result > 0 -> println("You win!")
        result < 0 -> println("Computer wins!")
    }
}

fun getUserChoice(): Int {
    var choice = 0
    while (choice !in 1..3) {
        print("Enter your choice (1-3): ")
        choice = readLine()?.toIntOrNull() ?: 0
    }
    return choice
}

fun getChoiceString(choice: Int): String {
    return when (choice) {
        1 -> "Rock"
        2 -> "Paper"
        3 -> "Scissors"
        else -> "Invalid"
    }
}

fun determineWinner(computerChoice: Int, userChoice: Int): Int {
    // Returns 0 for a tie, positive number for user win, negative number for computer win
    if (computerChoice == userChoice) {
        return 0
    }
    return when (computerChoice) {
        1 -> if (userChoice == 3) 1 else -1 // rock beats scissors, loses to paper
        2 -> if (userChoice == 1) 1 else -1 // paper beats rock, loses to scissors
        3 -> if (userChoice == 2) 1 else -1 // scissors beats paper, loses to rock
        else -> 0 // invalid choice, treated as tie
    }
}
