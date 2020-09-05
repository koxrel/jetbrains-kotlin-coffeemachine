import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val firstRangeStart = scanner.nextInt()
    val firstRangeFinish = scanner.nextInt()
    val secondRangeStart = scanner.nextInt()
    val secondRangeFinish = scanner.nextInt()
    val num = scanner.nextInt()

    println(num in firstRangeStart..firstRangeFinish || num in secondRangeStart..secondRangeFinish)
}