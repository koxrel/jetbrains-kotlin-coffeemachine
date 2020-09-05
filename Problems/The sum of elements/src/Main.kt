import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var sum = 0
    var currentNumber = scanner.nextInt()

    while (currentNumber != 0) {
        sum += currentNumber
        currentNumber = scanner.nextInt()
    }

    println(sum)
}