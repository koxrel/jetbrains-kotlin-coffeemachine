import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    for (i in 0..3) {
        print(scanner.next().first().isDigit())
        if (i != 3) {
            print('\\')
        }
    }
}