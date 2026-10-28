fun main() {
    val nums = listOf(4, 8, 15, 16, 23)

    // Первый элемент всегда имеет индекс 0
    println("first = ${nums[0]}")
    // Последний элемент находится по индексу (size - 1)
    println("last = ${nums[nums.size - 1]}")
    println("size = ${nums.size}")
}

