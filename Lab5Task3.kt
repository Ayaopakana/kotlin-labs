fun main() {
    print("Введите символ: ")
    val s = readln()
    val ch = s[0]

    val result = when (ch) {
        in '0'..'9' -> "Digit"
        in 'A'..'Z' -> "Uppercase"
        in 'a'..'z' -> "Lowercase"
        else -> "Other"
    }

    println(result)
}