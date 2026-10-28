fun main() {
    print("Введите текст: ")
    val text = readln()
    var count = 0

    for (i in 0 until text.length) {
        val ch = text[i]
        if (ch.isLetter()) {
            count = count + 1
        }
    }

    println("Letters: $count")
}