import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var max = 0
    var currentNum = scanner.nextInt()

    while (currentNum != 0) {
        if (currentNum > max) max = currentNum
        currentNum = scanner.nextInt()
    }

    println(max)
}