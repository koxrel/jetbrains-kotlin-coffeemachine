import java.util.Scanner

enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    println(Rainbow.valueOf(input.next().toUpperCase()).ordinal + 1)
}