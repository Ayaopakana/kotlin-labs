fun main() {
    var choice: String

    do {
        println("\n1) Hello")
        println("2) Quit")
        print("Choose an option: ")
        choice = readln()

        when (choice) {
            "1" -> println("Hello!")
            "2" -> println("Exiting...")
            else -> println("Unknown")
        }
    } while (choice != "2")
}