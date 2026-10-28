fun main() {
    print("Введите строчную букву (a-z): ")
    val input = readln()

    if (input.length > 0) {
        val ch = input[0]


        if (ch in 'a'..'z') {

            val shifted = 'a' + (ch - 'a' + 1) % 26
            println("Результат: $shifted")
        } else {

            println(ch)
        }
    }
}