import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()
    val newFirstDigit = num % 10
    val newSecondDigit = num / 10 % 10
    val newThirdDigit = num / 100
    println(newFirstDigit * 100 + newSecondDigit * 10 + newThirdDigit)
}