import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val (firstName, lastName, age) = Array(3) { scanner.next() }

    println("${firstName.first()}. $lastName, $age years old")
}