fun main() {

    val base: Long = 8_100_000_000L

    print("Enter extra people: ")
    val extra = readln().toInt()

    val total = base + extra.toLong()

    println("Base: $base")
    println("Extra: $extra")
    println("Total: $total")
}
