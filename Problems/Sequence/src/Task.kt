import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val firstChar = scanner.next().first()
    val secondChar = scanner.next().first()
    val thirdChar = scanner.next().first()

    println(secondChar == firstChar + 1 && thirdChar == secondChar + 1)
}