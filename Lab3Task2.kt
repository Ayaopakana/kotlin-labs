fun main() {
    print("Enter temperature in °C: ")
    val temp = readln().toInt()

    if (temp < 0) {
        println("Freezing")
    } else if (temp in 0..14) {
        println("Cold")
    } else if (temp in 15..24) {
        println("Mild")
    } else {
        println("Warm")
    }
}