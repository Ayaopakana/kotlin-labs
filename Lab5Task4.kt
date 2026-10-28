fun main() {
    print("Введите цифру: ")
    val s = readln()
    val ch = s[0]


    val value = ch - '0'

    println("value = $value")
    println("value * 2 = ${value * 2}")
}