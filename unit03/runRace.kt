fun main() {
    print("Enter the name of runner #1: ")
    val runner1 = readLine()!!
    print("Enter the time, in minutes, for runner #1: ")
    val time1 = readLine()!!.toFloat()
    print("Enter the name of runner #2: ")
    val runner2 = readLine()!!
    print("Enter the time, in minutes, for runner #2: ")
    val time2 = readLine()!!.toFloat()
    print("Enter the name of runner #3: ")
    val runner3 = readLine()!!
    print("Enter the time, in minutes, for runner #3: ")
    val time3 = readLine()!!.toFloat()

    val runners = listOf(Pair(runner1, time1), Pair(runner2, time2), Pair(runner3, time3))
        .sortedBy { it.second }

    println("The order of finish is:")
    runners.forEachIndexed { index, runner ->
        println("${index+1}. ${runner.first}")
    }
}
