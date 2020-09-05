import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var gradeA = 0
    var gradeB = 0
    var gradeC = 0
    var gradeD = 0

    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            5 -> gradeA++
            4 -> gradeB++
            3 -> gradeC++
            2 -> gradeD++
        }
    }
    println("$gradeD $gradeC $gradeB $gradeA")
}