import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val maxNum = scanner.nextInt()
    var currentNumber = 1
    var currentSquare = 1

    while (currentSquare <= maxNum) {
        println(currentSquare)

        currentNumber += 1
        currentSquare = currentNumber * currentNumber
    }
}