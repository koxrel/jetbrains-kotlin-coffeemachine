import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val ch = scanner.next().first()
    print(ch.isUpperCase() || ch.isDigit() && ch != '0')
}