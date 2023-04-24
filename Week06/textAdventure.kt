fun main() {
    println("You are in a dusty castle room.")
    println("Passages lead to the north and south.")
    var direction = readLine()?.trim()?.toLowerCase()
    while (direction != null) {
        when (direction) {
            "n" -> {
                println("You are in the armory.")
                println("There is a room off to the south.")
            }
            "s" -> {
                println("You are in a torch-lit hallway.")
                println("There are rooms to the east and west.")
            }
            "e" -> {
                println("You are in a bedroom. A window overlooks the castle courtyard.")
                println("A hallway is to the west.")
            }
            "w" -> {
                println("You are in the kitchen. It looks like a roast is being made for supper.")
                println("A hallway is to the east.")
            }
            else -> {
                println("Can't go that way.")
            }
        }
        println("What direction?")
        direction = readLine()?.trim()?.toLowerCase()
    }
}
