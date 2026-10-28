fun main() {
    print("Enter names separated by commas (e.g. Ada, Grace, Alan): ")
    val input = readln()


    val names = input.split(",")


    for (i in names.indices) {

        val trimmedName = names[i].trim()
        println("$i: $trimmedName")
    }
}