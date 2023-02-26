fun main() {
    val input = Scanner(System.`in`)

    print("Enter the first name: ")
    val name1 = input.nextLine()
    print("Enter the second name: ")
    val name2 = input.nextLine()
    print("Enter the third name: ")
    val name3 = input.nextLine()

    val names = listOf(name1, name2, name3).sorted()

    for (name in names) {
        println(name)
    }
}
