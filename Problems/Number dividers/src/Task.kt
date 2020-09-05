import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()

    for (i in listOf(2, 3, 5, 6)) {
        if (num % i == 0) println("Divided by $i")
    }
}