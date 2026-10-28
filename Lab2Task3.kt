fun main() {
    print("Enter total seconds: ")
    val totalSeconds = readln().toInt()

    val hours = totalSeconds / 3600

    val remainderAfterHours = totalSeconds % 3600

    val minutes = remainderAfterHours / 60

    val seconds = remainderAfterHours % 60

    println("H:M:S -> $hours:$minutes:$seconds")
}