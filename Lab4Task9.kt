fun main() {
    print("Enter numbers: ")
    val input = readln()


    val parts = input.split(" ")
    var sum = 0

    for (part in parts) {

        if (part.isNotBlank()) {
            sum += part.toInt()
        }
    }

    println("Sum = $sum")
}