import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()

    println(when (num) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> 'F'
        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> 'T'
        1, 10, 100, 1000, 10_000, 100_000 -> 'P'
        else -> 'N'
    })
}