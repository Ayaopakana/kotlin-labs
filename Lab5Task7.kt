fun main() {
    print("Введите один символ: ")
    val input = readln()
    val ch = input[0]

    println(ch.isDigit())
    println(ch.isLetter())
    println(ch.isWhitespace())
    println(ch.lowercaseChar())
    println(ch.uppercaseChar())
}