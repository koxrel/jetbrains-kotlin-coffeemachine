import java.util.Scanner

// write your function here
fun isVowel(ch: Char) = ch.toLowerCase() in setOf('a', 'i', 'o', 'u', 'e')

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}