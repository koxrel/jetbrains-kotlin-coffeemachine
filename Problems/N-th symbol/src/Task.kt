import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val str = scanner.nextLine()
    val char = scanner.nextInt()

    println("Symbol # $char of the string \"$str\" is '${str[char - 1]}'")
}