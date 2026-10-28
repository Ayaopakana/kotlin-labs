fun main() {
    print("Enter temperature in Celsius: ")
    val c = readln().toDouble()

    val f = c * 9.0 / 5.0 + 32.0

    println("C = $c")
    println("F = $f")

    val isBelowFreezing = f < 32.0
    if (isBelowFreezing) {
        println("below freezing")
    } else {
        println("not below freezing")
    }
}