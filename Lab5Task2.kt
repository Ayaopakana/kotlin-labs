fun main() {
    print("Введите текст: ")
    val line = readln()

    if (line.length == 0) {
        println("Empty input")
    } else {
        val first = line[0]
        val last = line[line.length - 1]

        println("first = $first")
        println("last = $last")
    }
}