fun main() {
    val responses = arrayOf(
        "Yes, of course!",
        "Without a doubt, yes.",
        "You can count on it.",
        "For sure!",
        "Ask me later.",
        "I’m not sure.",
        "I can’t tell you right now. I’ll tell you after my nap.",
        "No way!",
        "I don’t think so.",
        "Without a doubt, no."
    )
    var playAgain = true

    while (playAgain) {
        print("What's your yes or no question? ")
        val question = readLine()

        val responseIndex = (Math.random() * responses.size).toInt()
        val response = responses[responseIndex]
        println(response)

        print("Do you want to ask another question? (yes/no) ")
        val answer = readLine()
        playAgain = answer?.equals("yes", ignoreCase = true) ?: false
    }
    println("Goodbye!")
}
