import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()
    val rangeStart = scanner.nextInt()
    val rangeFinish = scanner.nextInt()

    // write your code here
    println(num in rangeStart..rangeFinish)
}