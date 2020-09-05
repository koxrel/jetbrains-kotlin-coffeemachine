import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val (first, second) = Array(2) { scanner.next() }

    println("$first $second")
}