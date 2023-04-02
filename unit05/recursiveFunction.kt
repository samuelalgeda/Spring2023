fun fibonacci(number: Int): Int {
    if (number <= 0) {
        return 0
    } else if (number == 1 || number == 2) {
        return 1
    } else {
        return fibonacci(number - 1) + fibonacci(number - 2)
    }
}

fun main() {
    println(fibonacci(1))  // = 1
    println(fibonacci(2))  // = 1
    println(fibonacci(3))  // = 2
    println(fibonacci(4))  // = 3
    println(fibonacci(5))  // = 5
    println(fibonacci(6))  // = 8
    println(fibonacci(7))  // = 13
    println(fibonacci(10)) // = 55
}
