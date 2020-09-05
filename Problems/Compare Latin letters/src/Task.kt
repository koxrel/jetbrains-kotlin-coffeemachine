import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val firstLetter = scanner.next().first()
    val secondLetter = scanner.next().first()

    print(firstLetter.toLowerCase() == secondLetter.toLowerCase())
}