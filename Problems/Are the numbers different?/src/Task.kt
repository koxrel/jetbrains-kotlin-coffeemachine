import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val firstNum = scanner.nextInt()
    val secondNum = scanner.nextInt()
    val thirdNum = scanner.nextInt()

    println(firstNum != secondNum && secondNum != thirdNum && firstNum != thirdNum)
}