fun main() {
    print("Enter integer n: ")
    val n = readln().toInt()

    val label = when {
        n < 0 -> "negative"
        n == 0 -> "zero"
        n > 0 && n % 2 == 0 -> "positive even"
        else -> "positive odd"
    }

    println(label)
}