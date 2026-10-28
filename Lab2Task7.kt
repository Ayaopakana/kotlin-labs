fun main() {
    val small: Byte = 100
    val medium: Short = 20_000

    // Сложение Byte и Short автоматически повышает результат до типа Int
    val sum = small + medium
    println("Sum: $sum")
    println("Type of sum: Int")
}

/*
 * Что будет, если изменить small на 200?
 * Возникнет ошибка компиляции, так как максимальное значение для типа Byte — 127
 * Число 200 не поместится в память размером 1 байт
 */