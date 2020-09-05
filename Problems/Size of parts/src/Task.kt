import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var numFix = 0
    var numReady = 0
    var numReject = 0

    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            -1 -> numReject++
            0 -> numReady++
            1 -> numFix++
        }
    }

    println("$numReady $numFix $numReject")
}