fun main() {
    print("Enter age: ")
    val age = readln().toInt()

    print("Has ticket (yes/no): ")
    val hasTicket = readln()


    if (age < 12) {
        println("Too young")
    } else if (hasTicket != "yes") {
        println("Need a ticket")
    } else {
        println("Enter")
    }
}